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
import com.esotericsoftware.spine.AnimationState.AnimationStateAdapter;
import com.esotericsoftware.spine.AnimationState.TrackEntry;
import com.esotericsoftware.spine.Event;
import com.esotericsoftware.spine.Skeleton;
import com.esotericsoftware.spine.SkeletonBounds;
import com.rafaskoberg.gdx.typinglabel.TypingLabel;
import com.ray3k.template.*;
import com.ray3k.template.screens.DialogDebug.*;

import static com.ray3k.template.Core.*;
import static com.ray3k.template.Resources.SpineEngineering2.*;
import static com.ray3k.template.Resources.*;

public class Engineering2Screen extends JamScreen {
    public Stage stage;
    private SpineDrawable spineDrawable;
    private SkeletonBounds skeletonBounds;
    private Skeleton skeleton;
    private TypingLabel typingLabel;
    
    @Override
    public void show() {
        super.show();
    
        bgm_game.stop();
        if (needToShoot) {
            bgm_action.setVolume(core.bgm / 4);
            bgm_action.setLooping(true);
            bgm_action.play();
        }
    
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
        animationState.setAnimation(1, animationAnimation, true);
        animationState.setAnimation(2, needToShoot? animationShooting : animationDone, true);
        animationState.addListener(new AnimationStateAdapter() {
            @Override
            public void event(TrackEntry entry, Event event) {
                sfx_machineGun.play(sfx * .2f);
            }
        });
        if (shotLight) animationState.setAnimation(3, animationNoLight, false);
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
        
        if (needToShoot && shotLight) {
            typingLabel = new TypingLabel("It’s dark, I don’t think he can see me at this range.", skin);
            playSound(sfx_lineItsDarkI);
        } else {
            typingLabel = new TypingLabel("", skin);
        }
        typingLabel.setWrap(true);
        table.add(typingLabel).growX();
        
        right.row();
        var inventoryTable = new InventoryTable();
        right.add(inventoryTable);
        inventoryTable.inventoryListener = button -> {
            if (needToShoot) {
                switch (button) {
                    case "gun":
                        if (!equippedGun) {
                            typingLabel.setText("I pull my rod. This sucker’s gon’ get it.");
                            typingLabel.restart();
                            playSound(sfx_lineIPullMy);
                            equippedGun = true;
                        }
                        break;
                    case "bullets":
                        if (!equippedGun) {
                            typingLabel.setText("I should equip my gun first.");
                            typingLabel.restart();
                            playSound(sfx_lineIShouldEquip);
                        } else if (!equippedAmmo) {
                            typingLabel.setText("Loaded. I’m feeling lethal.");
                            typingLabel.restart();
                            playSound(sfx_lineLoadedImFeeling);
                            equippedAmmo = true;
                        }
                        break;
                }
            } else {
                typingLabel.setText("This is not the time nor the place for that.");
                typingLabel.restart();
                playSound(sfx_lineThisIsNot);
            }
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
                    case "reactor":
                        if (equippedGun && equippedAmmo) {
                            core.transition(new ExplosionDeathScreen());
                        } else if (equippedGun && !equippedAmmo) {
                            core.transition(new NoAmmoDeathScreen());
                        } else {
                            typingLabel.setText("The main generator for the ship. Highly reactive and very unstable. ");
                            typingLabel.restart();
                            playSound(sfx_lineTheMainGenerator);
                        }
                        break;
                    case "crate":
                        if (needToShoot) {
                            typingLabel.setText("Thankfully I'm protected by this convenient, chest high cover.");
                            typingLabel.restart();
                            playSound(sfx_lineThankfullyImCovered);
                        }
                        break;
                    case "light":
                        if (equippedGun && equippedAmmo) {
                            shotLight = true;
                            core.transition(new ShootLightScreen());
                        } else if (equippedGun && !equippedAmmo) {
                            core.transition(new NoAmmoDeathScreen());
                        } else {
                            typingLabel.setText("This floor is dimly lit by sparse lighting fixtures.");
                            typingLabel.restart();
                            playSound(sfx_lineThisFloorIs);
                        }
                        break;
                    case "doorway":
                        if (needToShoot) {
                            if (shotLight && equippedAmmo && equippedGun) {
                                playSound(sfx_revolver);
                                needToShoot = false;
                                core.transition(new ShootManScreen());
                            } else if (equippedGun && !equippedAmmo) {
                                core.transition(new NoAmmoDeathScreen());
                            } else if (equippedGun && !shotLight) {
                                core.transition(new ShootoutDeathScreen());
                            } else if (!equippedGun) {
                                core.transition(new PeekDeathScreen());
                            }
                        } else {
                            bgm_action.stop();
                            
                            if (killedPanda) {
                                core.transition(new DarkHallwayScreen());
                            } else {
                                core.transition(new PeanutPandaScreen());
                            }
                        }
                        break;
                    case "ladder":
                        if (!needToShoot) {
                            core.transition(new Engineering1Screen());
                        } else {
                            core.transition(new PeekDeathScreen());
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
