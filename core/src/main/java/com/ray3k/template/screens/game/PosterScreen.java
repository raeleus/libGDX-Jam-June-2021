package com.ray3k.template.screens.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Buttons;
import com.badlogic.gdx.InputMultiplexer;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
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
import static com.ray3k.template.Resources.SpinePoster.*;
import static com.ray3k.template.Resources.*;

public class PosterScreen extends JamScreen {
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
        animationData.setDefaultMix(0f);
        animationState.setAnimation(0, animationAnimation, true);
        spineDrawable = new SpineDrawable(skeletonRenderer, skeleton, animationState);
        spineDrawable.setCrop(0, 0, 400, 400);
        
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
        
        typingLabel = new TypingLabel("Ship life is pretty rough. Everything marketed here is purely escapism.", skin);
        typingLabel.setWrap(true);
        table.add(typingLabel).growX().expandY().top();
        
        playSound(sfx_lineShipLifeIs);
        
        table.row();
        var textButton = new TextButton("Go Back", skin);
        table.add(textButton);
        textButton.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                core.transition(new CommonsScreen());
            }
        });
    
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

                }
            }
        } else {
//            spineDrawable.getAnimationState().setEmptyAnimation(0, .2f);
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
