package net.lishaoy.entity.fruit;

import net.lishaoy.entity.Fruit;

public class Banana implements Fruit {

    private String name = "";
    private int price = 12;


    public Banana(){}

    public Banana(String name, int price) {

        this.name = name;
        this.price = price;

    }

    @Override
    public int price() {

        return price;
    }

    @Override
    public void draw() {

        if(!name.isEmpty()){

            System.out.println( this.name + "送了一个 🍌");

        }else {

            System.out.println("摘了一个 🍌");
        }



    }

    public void setPrice(int price) {

        this.price = price;
    }
}
