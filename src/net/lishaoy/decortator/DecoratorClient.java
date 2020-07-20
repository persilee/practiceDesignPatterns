package net.lishaoy.decortator;

import net.lishaoy.entity.Fruit;
import net.lishaoy.entity.Pack;
import net.lishaoy.factory.factoryAbstract.AppleFactory;
import net.lishaoy.factory.factoryAbstract.FactoryAbstract;


/**
 * 装饰器模式
 */

public class DecoratorClient {

    public static void main(String[] args) {

        FactoryAbstract factoryAbstract = new AppleFactory();

        Fruit fruit = factoryAbstract.getFruit();

        fruit.draw();

        Pack pack = factoryAbstract.getPack();

        pack = new CheckedPackDecorator(pack);

        pack = new SpeedDecorator(pack);

        pack.packaging();


    }

}
