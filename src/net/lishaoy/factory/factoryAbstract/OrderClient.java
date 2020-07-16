package net.lishaoy.factory.factoryAbstract;

import net.lishaoy.entity.Fruit;
import net.lishaoy.entity.Pack;


/**
 * 抽象工厂模式
 */
public class OrderClient {

    public static void main(String[] args) {

        sendFruid();

    }

    public static void sendFruid() {

        FactoryAbstract factoryAbstract = new AppleFactory();

        Fruit fruit = factoryAbstract.getFruit();
        fruit.draw();

        Pack pack = factoryAbstract.getPack();
        pack.packaging();

    }

}
