package net.lishaoy.decortator;

import net.lishaoy.entity.Pack;

public class SpeedDecorator extends PackDecorator {

    SpeedDecorator(Pack pack) {

        super(pack);
    }

    @Override
    public void packaging() {

        super.packaging();
        speed();

    }

    public void speed() {

        System.out.println("增加加急处理");

    }
}
