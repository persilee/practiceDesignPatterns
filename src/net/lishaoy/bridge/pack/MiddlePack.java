package net.lishaoy.bridge.pack;

public class MiddlePack extends PackAbstraction {

    @Override
    public void pick() {

        this.material.draw();
        System.out.println("使用了中号的");

    }
}
