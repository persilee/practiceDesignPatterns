package net.lishaoy.builder;

import net.lishaoy.entity.fruit.Apple;
import net.lishaoy.entity.fruit.Banana;
import net.lishaoy.entity.fruit.Orange;

public class FruitSetMeal {

    private Apple apple;
    private Orange orange;
    private Banana banana;
    private int discount; //折扣价
    private int totalPrice; //套餐价格

    public void setApple(Apple apple) {

        this.apple = apple;
    }

    public void setOrange(Orange orange) {

        this.orange = orange;
    }

    public void setBanana(Banana banana) {

        this.banana = banana;
    }

    public void setDiscount(int discount) {

        this.discount = discount;
    }

    public void init() {

        if(apple != null) totalPrice += apple.price();
        if(orange != null) totalPrice += orange.price();
        if(banana != null) totalPrice += banana.price();
        if(totalPrice > 0) totalPrice -= discount;

    }

    public int getTotalPrice() {

        return totalPrice;

    }

}
