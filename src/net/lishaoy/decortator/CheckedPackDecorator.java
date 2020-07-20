package net.lishaoy.decortator;

import net.lishaoy.entity.Pack;

public class CheckedPackDecorator extends PackDecorator {

    CheckedPackDecorator(Pack pack) {

        super(pack);
    }

    @Override
    public void packaging() {

        super.packaging();
        checked();

    }

    public void checked() {

        System.out.println("增加防伪标识");

    }
}
