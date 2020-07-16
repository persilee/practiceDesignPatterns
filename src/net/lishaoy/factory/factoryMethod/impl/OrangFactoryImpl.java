package net.lishaoy.factory.factoryMethod.impl;

import net.lishaoy.entity.Fruit;
import net.lishaoy.entity.fruit.Orange;
import net.lishaoy.factory.factoryMethod.FruitFactory;

public class OrangFactoryImpl implements FruitFactory {

    @Override
    public Fruit getFruit() {

        return new Orange();
    }
}
