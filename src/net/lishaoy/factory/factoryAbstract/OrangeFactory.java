package net.lishaoy.factory.factoryAbstract;

import net.lishaoy.entity.Fruit;
import net.lishaoy.entity.Pack;
import net.lishaoy.entity.fruit.Orange;
import net.lishaoy.entity.pack.OrangePack;

public class OrangeFactory extends FactoryAbstract {

    @Override
    public Fruit getFruit() {

        return new Orange();
    }

    @Override
    public Pack getPack() {

        return new OrangePack();
    }
}
