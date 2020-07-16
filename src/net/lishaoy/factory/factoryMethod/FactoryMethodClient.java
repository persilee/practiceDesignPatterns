package net.lishaoy.factory.factoryMethod;


import net.lishaoy.entity.Fruit;
import net.lishaoy.factory.factoryMethod.impl.AppleFactoryImpl;
import net.lishaoy.factory.simple.SimpleFactory;

/**
 * 工厂方法模式
 */
public class FactoryMethodClient {

    private static FruitFactory fruitFactory;


    public static void main(String[] args) {

        fruitFactory = new AppleFactoryImpl();

        peterdo();
        jamesdo();
        lisondo();

    }

    public static void peterdo(){

        Fruit fruit = fruitFactory.getFruit();
        fruit.draw();

    }

    public static void jamesdo(){

        Fruit fruit = fruitFactory.getFruit();
        fruit.draw();

    }

    public static void lisondo(){

        Fruit fruit = fruitFactory.getFruit();
        fruit.draw();

    }

}
