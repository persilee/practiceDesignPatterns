package net.lishaoy.builder;

public interface Builder {

    void buildApple(int price);
    void buildOrange(int price);
    void buildBanana(int price);

    FruitSetMeal getFruitSetMeal();

}
