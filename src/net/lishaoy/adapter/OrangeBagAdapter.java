package net.lishaoy.adapter;

import net.lishaoy.entity.pack.ApplePack;
import net.lishaoy.entity.pack.OrangePack;

public class OrangeBagAdapter extends OrangePack {

    private ApplePack applePack;

    public OrangeBagAdapter(ApplePack applePack){

        this.applePack = applePack;

    }

    @Override
    public void packaging() {

        applePack.packaging();
    }
}
