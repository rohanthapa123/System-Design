package org.example.lld.decoratorPattern.toppings;

import org.example.lld.decoratorPattern.basepizza.BasePizza;

public class Mushroom extends ToppingDecorator{

    BasePizza basePizza;
    public Mushroom(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() + 20;
    }
}
