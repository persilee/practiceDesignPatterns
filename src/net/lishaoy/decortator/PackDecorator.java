package net.lishaoy.decortator;

import net.lishaoy.entity.Pack;

public class PackDecorator implements Pack {

    private Pack pack;

    PackDecorator(Pack pack) {

        this.pack = pack;

    }

    @Override
    public void packaging() {

        pack.packaging();

    }
}
