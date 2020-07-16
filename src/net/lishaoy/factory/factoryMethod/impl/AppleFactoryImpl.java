package net.lishaoy.factory.factoryMethod.impl;

import net.lishaoy.entity.Fruit;
import net.lishaoy.entity.fruit.Apple;
import net.lishaoy.factory.factoryMethod.FruitFactory;

public class AppleFactoryImpl implements FruitFactory {

    @Override
    public Fruit getFruit() {

        return new Apple();
    }
}
