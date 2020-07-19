package net.lishaoy.bridge.pack;

import net.lishaoy.bridge.material.Material;

public abstract class PackAbstraction {

    protected Material material;

    public void setMaterial(Material material) {

        this.material = material;
    }

    public abstract void pick();

}
