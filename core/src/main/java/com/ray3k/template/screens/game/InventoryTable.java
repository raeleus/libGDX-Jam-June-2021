package com.ray3k.template.screens.game;

import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;

import static com.ray3k.template.Core.*;

public class InventoryTable extends Table  {
    public static InventoryTable inventoryTable;
    public InventoryTable() {
        inventoryTable = this;
        refresh();
    }
    public InventoryListener inventoryListener;
    
    public void refresh() {
        clearChildren();
        setBackground(skin.getDrawable("toolbar"));
        if (foundGun) {
            var button = new Button(skin, "gun");
            add(button).expand();
            button.addListener(new ChangeListener() {
                @Override
                public void changed(ChangeEvent event, Actor actor) {
                    if (inventoryListener != null) inventoryListener.selected("gun");
                }
            });
        } else {
            var button = new Button(skin);
            add(button).expand();
        }
    
        if (foundAmmo) {
            var button = new Button(skin, "bullets");
            add(button).expand();
            button.addListener(new ChangeListener() {
                @Override
                public void changed(ChangeEvent event, Actor actor) {
                    if (inventoryListener != null) inventoryListener.selected("bullets");
                }
            });
        } else {
            var button = new Button(skin);
            add(button).expand();
        }
    
        if (foundScrewDriver) {
            var button = new Button(skin, "screw-driver");
            add(button).expand();
            button.addListener(new ChangeListener() {
                @Override
                public void changed(ChangeEvent event, Actor actor) {
                    if (inventoryListener != null) inventoryListener.selected("screw-driver");
                }
            });
        } else if (foundBoltCutters) {
            var button = new Button(skin, "bolt-cutter");
            add(button).expand();
            button.addListener(new ChangeListener() {
                @Override
                public void changed(ChangeEvent event, Actor actor) {
                    if (inventoryListener != null) inventoryListener.selected("bolt-cutters");
                }
            });
        } else {
            var button = new Button(skin);
            add(button).expand();
        }
    
        if (foundBobbyPin) {
            var button = new Button(skin, "bobby-pin");
            add(button).expand();
            button.addListener(new ChangeListener() {
                @Override
                public void changed(ChangeEvent event, Actor actor) {
                    if (inventoryListener != null) inventoryListener.selected("bobby-pin");
                }
            });
        } else if (foundBlueprints) {
            var button = new Button(skin, "blueprints");
            add(button).expand();
            button.addListener(new ChangeListener() {
                @Override
                public void changed(ChangeEvent event, Actor actor) {
                    if (inventoryListener != null) inventoryListener.selected("bobby-pin");
                }
            });
        } else {
            var button = new Button(skin);
            add(button).expand();
        }
    }
    
    public interface InventoryListener {
        void selected(String button);
    }
}
