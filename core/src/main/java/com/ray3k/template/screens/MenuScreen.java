package com.ray3k.template.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.badlogic.gdx.video.VideoPlayer;
import com.badlogic.gdx.video.VideoPlayer.CompletionListener;
import com.ray3k.template.*;
import com.ray3k.template.screens.game.*;

import static com.ray3k.template.Core.*;
import static com.ray3k.template.Resources.*;

public class MenuScreen extends JamScreen {
    private Stage stage;
    private final static Color BG_COLOR = new Color(Color.BLACK);
    
    @Override
    public void show() {
        super.show();
    
        final Music bgm = bgm_menu;
        if (!bgm.isPlaying()) {
            bgm.play();
            bgm.setVolume(core.bgm);
            bgm.setLooping(true);
        }
        
        stage = new Stage(new ScreenViewport(), batch);
        Gdx.input.setInputProcessor(stage);
    
        sceneBuilder.build(stage, skin, Gdx.files.internal("menus/main.json"));
        
        var videoDrawable = new VideoDrawable(Gdx.files.internal("video/menu.webm"));
        videoDrawable.setMinSize(400, 400);
        videoDrawable.videoPlayer.setOnCompletionListener(file -> {
            try {
                videoDrawable.videoPlayer.play(Gdx.files.internal("video/menu.webm"));
            } catch (Exception e) {}
        });
        Image image = stage.getRoot().findActor("video");
        image.setDrawable(videoDrawable);
        
        TextButton textButton = stage.getRoot().findActor("play");
        textButton.addListener(sndChangeListener);
        textButton.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                Gdx.input.setInputProcessor(null);
                bgm.stop();
                foundGun = false;
                foundAmmo = false;
                foundBobbyPin = false;
                foundBoltCutters = false;
                foundScrewDriver = false;
                needEngineering = false;
                foundFood = false;
                needScrewDriver = false;
                needBoltCutters = false;
                unlockedStorage = false;
                foundBlueprints = false;
                needToShoot = true;
                equippedGun = false;
                equippedAmmo = false;
                shotLight = false;
                unlockedMechanicalLock = false;
                killedPanda = false;
                core.transition(new IntroScreen());
                bgm_menu.stop();
                bgm_game.setVolume(core.bgm / 4);
                bgm_game.setLooping(true);
                bgm_game.play();
                playedSounds.clear();
            }
        });
    
        textButton = stage.getRoot().findActor("options");
        textButton.addListener(sndChangeListener);
        textButton.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                Gdx.input.setInputProcessor(null);
                core.transition(new OptionsScreen());
            }
        });
    
        textButton = stage.getRoot().findActor("credits");
        textButton.addListener(sndChangeListener);
        textButton.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                Gdx.input.setInputProcessor(null);
                core.transition(new CreditsScreen());
            }
        });
    }
    
    @Override
    public void act(float delta) {
        stage.act(delta);
    }
    
    @Override
    public void draw(float delta) {
        Gdx.gl.glClearColor(BG_COLOR.r, BG_COLOR.g, BG_COLOR.b, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
    
        batch.setBlendFunction(GL20.GL_SRC_ALPHA, GL20.GL_ONE_MINUS_SRC_ALPHA);
        stage.draw();
    }
    
    @Override
    public void resize(int width, int height) {
        stage.getViewport().update(width, height, true);
    }
}
