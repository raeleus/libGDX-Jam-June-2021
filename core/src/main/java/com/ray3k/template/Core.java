package com.ray3k.template;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Preferences;
import com.badlogic.gdx.assets.loaders.SkinLoader.SkinParameter;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import com.badlogic.gdx.utils.Array;
import com.dongbat.jbump.CollisionFilter;
import com.dongbat.jbump.Response;
import com.dongbat.jbump.World;
import com.esotericsoftware.spine.AnimationStateData;
import com.esotericsoftware.spine.SkeletonData;
import com.esotericsoftware.spine.SkeletonRenderer;
import com.ray3k.template.AnimationStateDataLoader.*;
import com.ray3k.template.entities.*;
import com.ray3k.template.screens.*;
import com.ray3k.template.transitions.*;

import static com.ray3k.template.Resources.*;

public class Core extends JamGame {
    public static final String PROJECT_NAME = "Detective Zebra";
    public static Core core;
    public static Skin skin;
    public static SkeletonRenderer skeletonRenderer;
    public static ChangeListener sndChangeListener;
    public static EntityController entityController;
    public static World<Entity> world;
    public static CollisionFilter defaultCollisionFilter;
    public static CollisionFilter nullCollisionFilter;
    public static CrossPlatformWorker crossPlatformWorker;
    public enum Binding {
        LEFT, RIGHT, UP, DOWN, SHOOT, SPECIAL, SHIELD;
    }
    public static float bgm;
    public static float sfx;
    public static Preferences preferences;
    public static boolean foundGun;
    public static boolean foundAmmo;
    public static boolean foundBoltCutters;
    public static boolean foundBobbyPin;
    public static boolean foundScrewDriver;
    public static boolean foundBlueprints;
    public static boolean needEngineering;
    public static boolean foundFood;
    public static boolean needScrewDriver;
    public static boolean needBoltCutters;
    public static boolean unlockedStorage;
    public static boolean needToShoot;
    public static boolean equippedGun;
    public static boolean equippedAmmo;
    public static boolean shotLight;
    public static boolean killedPanda;
    public static boolean unlockedMechanicalLock;
    public static Array<Sound> playedSounds = new Array<>();
    
    @Override
    public void create() {
        super.create();
        var file = Gdx.files.internal("spine/libgdx.json");
        core = this;
        
        preferences = Gdx.app.getPreferences(PROJECT_NAME);
        
        bgm = preferences.getFloat("bgm", 1.0f);
        sfx = preferences.getFloat("sfx", 1.0f);
        
        setDefaultBindings();
        JamScreen.loadBindings();
        
        skeletonRenderer = new SkeletonRenderer();
        skeletonRenderer.setPremultipliedAlpha(true);
        
        entityController = new EntityController();
        
        world = new World<>(100);
        defaultCollisionFilter = (item, other) -> Response.bounce;
        nullCollisionFilter = (Item, Other) -> null;
        
        sndChangeListener = new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                sfx_click.play(sfx);
            }
        };
        
        setScreen(new LoadScreen(() -> {
            loadResources(assetManager);
            skin = skin_skin;
        }));
        defaultTransition = Transitions.colorFade(Color.BLACK);
        defaultTransitionDuration = .5f;
    }
    
    @Override
    public void render() {
        super.render();
    }
    
    @Override
    public void loadAssets() {
        assetManager.setLoader(Skin.class, new SkinFreeTypeLoader(assetManager.getFileHandleResolver()));
        assetManager.setLoader(SkeletonData.class, new SkeletonDataLoader(assetManager.getFileHandleResolver()));
        assetManager.setLoader(AnimationStateData.class, new AnimationStateDataLoader(assetManager.getFileHandleResolver()));
        
        String textureAtlasPath = null;
        var fileHandle = Gdx.files.internal("textures.txt");
        if (fileHandle.exists()) for (String path : fileHandle.readString("UTF-8").split("\\n")) {
            assetManager.load(path, TextureAtlas.class);
            textureAtlasPath = path;
        }
        
        fileHandle = Gdx.files.internal("skin.txt");
        if (fileHandle.exists()) for (String path : fileHandle.readString("UTF-8").split("\\n")) {
            assetManager.load(path, Skin.class, new SkinParameter(textureAtlasPath));
        }
    
        fileHandle = Gdx.files.internal("bgm.txt");
        if (fileHandle.exists()) for (String path : fileHandle.readString("UTF-8").split("\\n")) {
            assetManager.load(path, Music.class);
        }
    
        fileHandle = Gdx.files.internal("sfx.txt");
        if (fileHandle.exists()) for (String path : fileHandle.readString("UTF-8" ).split("\\n")) {
            assetManager.load(path, Sound.class);
        }
        
        fileHandle = Gdx.files.internal("spine.txt");
        if (fileHandle.exists()) for (String path2 : fileHandle.readString("UTF-8").split("\\n")) {
            assetManager.load(path2 + "-animation", AnimationStateData.class, new AnimationStateDataParameter(path2, textureAtlasPath));
        }
    }
    
    public void setDefaultBindings() {
        JamScreen.addKeyBinding(Binding.LEFT, Input.Keys.LEFT);
        JamScreen.addKeyBinding(Binding.RIGHT, Input.Keys.RIGHT);
        JamScreen.addKeyBinding(Binding.UP, Input.Keys.UP);
        JamScreen.addKeyBinding(Binding.DOWN, Input.Keys.DOWN);
        JamScreen.addKeyBinding(Binding.SHOOT, Input.Keys.Z);
        JamScreen.addKeyBinding(Binding.SHIELD, Input.Keys.X);
        JamScreen.addKeyBinding(Binding.SPECIAL, Input.Keys.C);
    }
    
    private static Sound lastPlayedSound;
    public static void playSound(Sound sound) {
        if (!playedSounds.contains(sound, true)) {
            if (lastPlayedSound != null) lastPlayedSound.stop();
            sound.play(sfx);
            lastPlayedSound = sound;
            playedSounds.add(sound);
        }
    }
    
    public static void stopSound() {
        if (lastPlayedSound != null) lastPlayedSound.stop();
    }
}
