package com.ray3k.template.screens.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputMultiplexer;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.Align;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.esotericsoftware.spine.AnimationState;
import com.esotericsoftware.spine.AnimationState.AnimationStateAdapter;
import com.esotericsoftware.spine.AnimationState.TrackEntry;
import com.esotericsoftware.spine.Skeleton;
import com.esotericsoftware.spine.SkeletonBounds;
import com.rafaskoberg.gdx.typinglabel.TypingLabel;
import com.ray3k.template.*;
import com.ray3k.template.screens.DialogDebug.*;

import static com.ray3k.template.Core.*;
import static com.ray3k.template.Resources.SpineMechanicalLock.*;
import static com.ray3k.template.Resources.*;

public class MechanicalLockScreen extends JamScreen {
    public Stage stage;
    private SpineDrawable spineDrawable;
    private SkeletonBounds skeletonBounds;
    private Skeleton skeleton;
    private TypingLabel typingLabel;
    private float target;
    private boolean canRotate = true;
    private int tries;
    
    @Override
    public void show() {
        super.show();
        needScrewDriver = true;
        target = MathUtils.random(400f);
        tries = 0;
    
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
        animationState.setAnimation(1, animationBobbyPin, true);
        animationState.getCurrent(1).setTimeScale(0);
        if (!foundBobbyPin) animationState.setAnimation(2, animationNoBobbyPin, false);
        if (!foundScrewDriver) animationState.setAnimation(3, animationNoScrewdriver, false);
        animationState.addListener(new AnimationStateAdapter() {
            @Override
            public void complete(TrackEntry entry) {
                canRotate = true;
                if (entry.getAnimation() == animationUnlocked) {
                    core.transition(new LabScreen());
                }
            }
        });
        spineDrawable = new SpineDrawable(skeletonRenderer, skeleton, animationState);
        spineDrawable.setCrop(0, 0, 400, 400);
        
        var table = new Table();
        table.setBackground(skin.getDrawable("box"));
        root.add(table);
        
        var image = new Image(spineDrawable);
        table.add(image);
        image.addListener(new ClickListener() {
            @Override
            public boolean mouseMoved(InputEvent event, float x, float y) {
                if (canRotate && foundBobbyPin) {
                    animationState.getCurrent(1).setTrackTime(x / 400f);
                }
                return true;
            }
    
            @Override
            public void clicked(InputEvent event, float x, float y) {
                if (foundScrewDriver && foundBobbyPin) {
                    if (canRotate) {
                        tries++;
                        canRotate = false;
                        if (tries >= 10) {
                            animationState.setAnimation(0, animationBroken, false);
                            foundBobbyPin = false;
                            InventoryTable.inventoryTable.refresh();
                            typingLabel.setText("Dammit, looks like I need to print another bobby pin.");
                            typingLabel.restart();
                            playSound(sfx_lineDammitLooksLike);
                        }
                        else if (Math.abs(target - x) < 50) {
                            sfx_unlock.play(sfx);
                            animationState.setAnimation(0, animationUnlocked, false);
                            unlockedMechanicalLock = true;
                        }
                        else if (Math.abs(target - x) < 100) {
                            sfx_pin.play(sfx);
                            animationState.setAnimation(0, animationClose, false);
                        }
                        else {
                            sfx_pin.play(sfx);
                            animationState.setAnimation(0, animationFar, false);
                        }
                        typingLabel.setText("(Move the mouse to position the pin, click to rotate chamber)");
                        typingLabel.restart();
                    }
                } else {
                    typingLabel.setText("(You need a screwdriver and a bobby pin to crack this bad boy)");
                    typingLabel.restart();
                }
            }
        });
        
        var right = new Table();
        right.defaults().space(10);
        root.add(right);
        
        table = new Table();
        table.setBackground(skin.getDrawable("box-10"));
        right.add(table);
        table.align(Align.top);
        
        typingLabel = new TypingLabel("Hmm. A mechanical lock. Not very usual on this craft. Maybe someone was trying to stay off the grid.", skin);
        typingLabel.setWrap(true);
        table.add(typingLabel).growX().expandY().top();
        
        playSound(sfx_lineHmmAMechanical);
        
        table.row();
        var subTable = new Table();
        table.add(subTable);
        
        table.row();
        var textButton = new TextButton("Go Back", skin);
        table.add(textButton);
        textButton.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                core.transition(new DarkHallwayScreen());
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
