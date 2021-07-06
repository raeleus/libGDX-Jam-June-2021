package com.ray3k.template.screens.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Buttons;
import com.badlogic.gdx.InputMultiplexer;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.utils.Align;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.esotericsoftware.spine.AnimationState;
import com.esotericsoftware.spine.Skeleton;
import com.esotericsoftware.spine.SkeletonBounds;
import com.rafaskoberg.gdx.typinglabel.TypingLabel;
import com.ray3k.template.*;
import com.ray3k.template.screens.DialogDebug.*;

import static com.ray3k.template.Core.*;
import static com.ray3k.template.Resources.*;
import static com.ray3k.template.Resources.SpineOffice.*;

public class OfficeScreen extends JamScreen {
    public Stage stage;
    private SpineDrawable spineDrawable;
    private SkeletonBounds skeletonBounds;
    private Skeleton skeleton;
    private TypingLabel typingLabel;
    
    @Override
    public void show() {
        super.show();
    
        viewport = new FitViewport(1024, 576);
        stage = new Stage(viewport, batch);
        
        var root = new Table();
        root.setFillParent(true);
        root.defaults().space(10);
        stage.addActor(root);
        
        stage.addListener(new DebugListener());
    
        InputMultiplexer inputMultiplexer = new InputMultiplexer(stage, this);
        Gdx.input.setInputProcessor(inputMultiplexer);
        
        skeletonBounds = new SkeletonBounds();
        skeleton = new Skeleton(skeletonData);
        var animationState = new AnimationState(animationData);
        animationData.setDefaultMix(.2f);
        spineDrawable = new SpineDrawable(skeletonRenderer, skeleton, animationState);
        
        var table = new Table();
        table.setBackground(skin.getDrawable("box"));
        root.add(table);
        
        var image = new Image(spineDrawable);
        table.add(image);
        
        var right = new Table();
        right.defaults().space(10);
        root.add(right);
        
        table = new Table();
        table.setBackground(skin.getDrawable("box-10"));
        right.add(table);
        table.align(Align.top);
        
        if (!foundGun) {
            typingLabel = new TypingLabel("I need to pack some heat if I'm going to take on these guys alone.", skin);
            playSound(sfx_lineINeedToPack);
        } else if (!foundAmmo) {
            typingLabel = new TypingLabel("I need my ammo unless I'm just gonna throw foul language at them.", skin);
            playSound(sfx_lineINeedMyAmmo);
        } else {
            typingLabel = new TypingLabel("My office. If only these walls could talk...", skin);
            playSound(sfx_lineMyOfficeIf);
        }
        typingLabel.setWrap(true);
        table.add(typingLabel).growX();
        
        
        right.row();
        var inventoryTable = new InventoryTable();
        right.add(inventoryTable);
        inventoryTable.inventoryListener = button -> {
            playSound(sfx_lineThisIsNot);
            typingLabel.setText("This is not the time nor the place for that.");
            typingLabel.restart();
        };
    }
    
    @Override
    public void act(float delta) {
        spineDrawable.update(delta);
        stage.act(delta);
        
        skeletonBounds.update(skeleton, true);
        var bbox = skeletonBounds.containsPoint(mouseX, mouseY);
        if (bbox != null) {
            var current = spineDrawable.getAnimationState().getCurrent(0);
            var next = skeletonData.findAnimation(bbox.getName());
            if (current == null || current.getAnimation() != next) {
                spineDrawable.getAnimationState().setAnimation(0, next, true);
            }
            if (isButtonJustPressed(Buttons.LEFT)) {
                switch (bbox.getName()) {
                    case "filing-cabinet":
                        typingLabel.setText("A bunch of useless files. The captain sure likes his \"due process\" and paperwork.");
                        typingLabel.restart();
                        playSound(sfx_lineABunchOfUseless);
                        break;
                    case "clock":
                        core.transition(new Clock1Screen());
                        break;
                    case "window":
                        core.transition(new PortHoleScreen());
                        break;
                    case "desk":
                        core.transition(new DeskScreen());
                        break;
                    case "plant":
                        core.transition(new PlantScreen());
                        break;
                    case "arrow":
                        if (!foundGun) {
                            typingLabel = new TypingLabel("I need to pack some heat if I'm going to take on these guys alone.", skin);
                            typingLabel.restart();
                            playSound(sfx_lineINeedToPack);
                        } else if (!foundAmmo) {
                            typingLabel = new TypingLabel("I need my ammo unless I'm just gonna throw foul language at them.", skin);
                            typingLabel.restart();
                            playSound(sfx_lineINeedMyAmmo);
                        } else {
                            core.transition(new HallwayScreen());
                        }
                        break;
                }
                System.out.println(bbox.getName());
            }
        } else {
            spineDrawable.getAnimationState().setEmptyAnimation(0, .2f);
        }
    }
    
    @Override
    public void draw(float delta) {
        batch.setBlendFunction(GL20.GL_SRC_ALPHA, GL20.GL_ONE_MINUS_SRC_ALPHA);
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        stage.getViewport().apply();
        stage.draw();
    }
    
    @Override
    public void resize(int width, int height) {
        if (width + height != 0) {
            stage.getViewport().update(width, height, true);
        }
    }
    
    @Override
    public void dispose() {

    }
    
    @Override
    public void hide() {
        super.hide();
    }
}
