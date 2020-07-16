package net.lishaoy.builder;


/**
 * 建造者模式
 */
public class FruitSetMealController {

    public static void main(String[] args) {

        getMealPrice();

    }

    public static void getMealPrice(){

        Builder builder = new CustomBuilder();

        builder.buildApple(26);
        builder.buildOrange(16);
        builder.buildBanana(6);

        FruitSetMeal fruitSetMeal = builder.getFruitSetMeal();

        System.out.println("套餐价格：" + fruitSetMeal.getTotalPrice());

    }


}
