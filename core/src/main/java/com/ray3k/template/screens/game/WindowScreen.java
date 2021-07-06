package com.ray3k.template.screens.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.ObjectSet;
import com.badlogic.gdx.utils.Scaling;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.esotericsoftware.spine.AnimationState;
import com.esotericsoftware.spine.Event;
import com.esotericsoftware.spine.Skeleton;
import com.esotericsoftware.spine.utils.SkeletonDrawable;
import com.ray3k.template.*;

import static com.ray3k.template.Core.*;
import static com.ray3k.template.Resources.SpineWindow.*;

public class WindowScreen extends JamScreen {
    private Stage stage;
    private Array<SpineDrawable> spineDrawables;
    private final static Color BG_COLOR = new Color(Color.BLACK);
    private ObjectSet<Sound> sounds;
    private ObjectSet<Music> musics;
    
    @Override
    public void show() {
        super.show();

        spineDrawables = new Array<>();
        sounds = new ObjectSet<>();
        musics = new ObjectSet<>();
        
        Skeleton skeleton = new Skeleton(skeletonData);
        AnimationState animationState = new AnimationState(animationData);
        var spineDrawable = new SpineDrawable(skeletonRenderer, skeleton, animationState);
        spineDrawable.getAnimationState().setAnimation(0, animationStand, false);
        spineDrawable.getAnimationState().apply(spineDrawable.getSkeleton());
        spineDrawable.setCrop(0, 0, 1024, 576);
        spineDrawables.add(spineDrawable);
        
        stage = new Stage(new ScreenViewport(), batch);
        Gdx.input.setInputProcessor(stage);
        
        Table root = new Table();
        root.setFillParent(true);
        stage.addActor(root);
    
        Image image = new Image(spineDrawable);
        image.setScaling(Scaling.fit);
        root.add(image).grow();
        
        spineDrawable.getAnimationState().setAnimation(0, animationSpeech, false);
        spineDrawable.getAnimationState().setAnimation(1, animationAnimation, true);
        spineDrawable.getAnimationState().setAnimation(2, animationBlink, true);
    
        spineDrawable.getAnimationState().addListener(new AnimationState.AnimationStateAdapter() {
            @Override
            public void complete(AnimationState.TrackEntry entry) {
                if (entry.getAnimation() == animationSpeech) {
                    if (foundFood) {
                        core.transition(new SecretEndingScreen());
                    } else {
                        core.transition(new FloatDeathScreen());
                    }
                }
            }
    
            @Override
            public void event(AnimationState.TrackEntry entry, Event event) {
                if (event.getData().getAudioPath() != null && !event.getData().getAudioPath().equals("")) {
                    var path = event.getData().getAudioPath();
                    if (path.startsWith("sfx")) {
                        Sound sound = assetManager.get(path);
                        sound.play(sfx);
                        sounds.add(sound);
                    } else if (path.startsWith("bgm")) {
                        Music music = assetManager.get(path);
                        music.play();
                        musics.add(music);
                    }
                }
            }
        });
        
        stage.addListener(new InputListener() {
            @Override
            public boolean keyDown(InputEvent event, int keycode) {
                if (foundFood) {
                    core.transition(new SecretEndingScreen());
                } else {
                    core.transition(new FloatDeathScreen());
                }
                return true;
            }
    
            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                if (foundFood) {
                    core.transition(new SecretEndingScreen());
                } else {
                    core.transition(new FloatDeathScreen());
                }
                return true;
            }
        });
    }
    
    @Override
    public void act(float delta) {
        stage.act(delta);
        
        for (SkeletonDrawable skeletonDrawable : spineDrawables) {
            skeletonDrawable.update(delta);
        }
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
    
    @Override
    public void hide() {
        super.hide();
        for (Sound sound : sounds) {
            sound.stop();
        }
        for (Music music : musics) {
            music.stop();
        }
    }
}
