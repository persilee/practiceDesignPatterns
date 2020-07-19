package net.lishaoy.bridge.pack;

public class SmallPack extends PackAbstraction {

    @Override
    public void pick() {

        this.material.draw();
        System.out.println("使用了小号的");

    }
}
