package net.lishaoy.factory.factoryAbstract;

import net.lishaoy.entity.Fruit;
import net.lishaoy.entity.Pack;
import net.lishaoy.entity.fruit.Apple;
import net.lishaoy.entity.pack.ApplePack;

public class AppleFactory extends FactoryAbstract {

    @Override
    public Fruit getFruit() {

        return new Apple();
    }

    @Override
    public Pack getPack() {

        return new ApplePack();
    }
}
