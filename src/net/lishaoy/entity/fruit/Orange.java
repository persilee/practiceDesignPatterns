package net.lishaoy.entity.fruit;

import net.lishaoy.entity.Fruit;
import net.lishaoy.entity.pack.OrangePack;

public class Orange implements Fruit {

    private int price = 16;

    @Override
    public int price() {

        return price;
    }

    @Override
    public void draw() {

        System.out.println("摘了一个 🍊");

    }

    public void setPrice(int price) {

        this.price = price;
    }

    public void packing(OrangePack orangePack) {

        orangePack.packaging();

    }
}
