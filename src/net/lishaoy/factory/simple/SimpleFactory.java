package net.lishaoy.factory.simple;

import net.lishaoy.entity.Fruit;
import net.lishaoy.entity.fruit.Apple;
import net.lishaoy.entity.fruit.Banana;
import net.lishaoy.entity.fruit.Orange;


/**
 * 简单工厂模式
 */

public class SimpleFactory {

    public static final int TYPE_APPLE = 1; //🍎
    public static final int TYPE_ORANGE = 2; //🍊
    public static final int TYPE_BANANA = 3; //🍌

    public static Fruit getFruit(int type) {

        switch (type) {

            case TYPE_APPLE:
                return new Apple();
            case TYPE_ORANGE:
                return new Orange();
            case TYPE_BANANA:
                return new Banana("peter", 26);
            default:
                return null;

        }

    }


    /**
     * 获取 🍎
     * @return
     */
    public static Fruit getApple() {

        return new Apple();

    }

    /**
     * 获取 🍊
     * @return
     */
    public static Fruit getOrange() {

        return new Orange();

    }

    /**
     * 获取 🍌
     * @return
     */
    public static Fruit getBanana() {

        return new Banana();

    }

}
