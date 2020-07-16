package net.lishaoy.factory.simple;


import net.lishaoy.entity.Fruit;
import net.lishaoy.entity.fruit.Apple;
import net.lishaoy.entity.fruit.Banana;
import net.lishaoy.entity.fruit.Orange;

/**
 * 简单工厂模式
 */
public class SimpleFactoryClient {


    public static void main(String[] args) {

        peterdo();
        jamesdo();
        lisondo();

    }

    public static void peterdo(){

        Fruit fruit = SimpleFactory.getFruit(SimpleFactory.TYPE_APPLE);
        fruit.draw();

        System.out.println("peter 啃着吃 🍎");

    }

    public static void jamesdo(){

        Fruit fruit = SimpleFactory.getFruit(SimpleFactory.TYPE_ORANGE);
        fruit.draw();

        System.out.println("james 切开吃 🍊");

    }

    public static void lisondo(){

        Fruit fruit = SimpleFactory.getBanana();
        fruit.draw();

        System.out.println("lison 榨汁吃 🍌");

    }

}
