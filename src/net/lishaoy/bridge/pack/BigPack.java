package net.lishaoy.bridge.pack;

public class BigPack extends PackAbstraction {

    @Override
    public void pick() {

        this.material.draw();
        System.out.println("使用了大号的");

    }
}
