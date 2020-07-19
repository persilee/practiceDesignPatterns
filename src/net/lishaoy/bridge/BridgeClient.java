package net.lishaoy.bridge;

import net.lishaoy.bridge.material.Carton;
import net.lishaoy.bridge.material.Material;
import net.lishaoy.bridge.pack.PackAbstraction;
import net.lishaoy.bridge.pack.SmallPack;

public class BridgeClient {

    public static void main(String[] args) {

        Material material = new Carton();

        PackAbstraction packAbstraction = new SmallPack();

        packAbstraction.setMaterial(material);

        packAbstraction.pick();

    }

}
