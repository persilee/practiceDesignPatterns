package net.lishaoy.factory.factoryAbstract;

import net.lishaoy.entity.Fruit;
import net.lishaoy.entity.Pack;
import net.lishaoy.entity.fruit.Banana;
import net.lishaoy.entity.pack.BananaPack;

public class BananaFactory extends FactoryAbstract {

    @Override
    public Fruit getFruit() {

        return new Banana();
    }

    @Override
    public Pack getPack() {

        return new BananaPack();
    }
}
