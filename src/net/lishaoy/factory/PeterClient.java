package net.lishaoy.factory;


import net.lishaoy.entity.Fruit;
import net.lishaoy.entity.fruit.Apple;
import net.lishaoy.entity.fruit.Banana;
import net.lishaoy.entity.fruit.Orange;

/**
 * 散养的类，由类自己创建实体类
 */
public class PeterClient {


    public static void main(String[] args) {

        peterdo();
        jamesdo();
        lisondo();

    }

    public static void peterdo(){

        Fruit fruit = new Apple();
        fruit.draw();

        System.out.println("peter 啃着吃 🍎");

    }

    public static void jamesdo(){

        Fruit fruit = new Orange();
        fruit.draw();

        System.out.println("james 切开吃 🍊");

    }

    public static void lisondo(){

        Fruit fruit = new Banana("peter",16);
        fruit.draw();

        System.out.println("lison 榨汁吃 🍌");

    }

}
