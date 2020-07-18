package net.lishaoy.adapter;

import net.lishaoy.entity.fruit.Orange;
import net.lishaoy.entity.pack.ApplePack;

public class AdapterClient {

    public static void main(String[] args) {

        Orange orange = new Orange();

        orange.draw();

        ApplePack applePack = new ApplePack();

        OrangeBagAdapter orangeBagAdapter = new OrangeBagAdapter(applePack);

        orange.packing(orangeBagAdapter);

    }



}
