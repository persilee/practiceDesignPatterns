package net.lishaoy.entity.fruit;

import net.lishaoy.entity.Fruit;

public class Apple implements Fruit {

    private int price = 16;

    public Apple(){}

    public Apple(int price){
        this.price = price;
    }

    @Override
    public int price() {

        return price;
    }

    @Override
    public void draw() {

        System.out.println("摘了一个 🍎");

    }

    public void setPrice(int price) {

        this.price = price;
    }
}
