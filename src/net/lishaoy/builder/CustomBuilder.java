package net.lishaoy.builder;

import net.lishaoy.entity.fruit.Apple;
import net.lishaoy.entity.fruit.Banana;
import net.lishaoy.entity.fruit.Orange;

public class CustomBuilder implements Builder {

    private FruitSetMeal fruitSetMeal = new FruitSetMeal();

    @Override
    public void buildApple(int price) {

        Apple apple = new Apple();
        apple.setPrice(price);
        fruitSetMeal.setApple(apple);

    }

    @Override
    public void buildOrange(int price) {

        Orange orange = new Orange();
        orange.setPrice(price);
        fruitSetMeal.setOrange(orange);

    }

    @Override
    public void buildBanana(int price) {

        Banana banana = new Banana();
        banana.setPrice(price);
        fruitSetMeal.setBanana(banana);

    }

    @Override
    public FruitSetMeal getFruitSetMeal() {

        fruitSetMeal.setDiscount(12);
        fruitSetMeal.init();

        return fruitSetMeal;
    }
}
