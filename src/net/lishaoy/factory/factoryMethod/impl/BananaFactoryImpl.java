package net.lishaoy.factory.factoryMethod.impl;

import net.lishaoy.entity.Fruit;
import net.lishaoy.entity.fruit.Banana;
import net.lishaoy.factory.factoryMethod.FruitFactory;

public class BananaFactoryImpl implements FruitFactory {

    @Override
    public Fruit getFruit() {

        return new Banana();
    }
}
