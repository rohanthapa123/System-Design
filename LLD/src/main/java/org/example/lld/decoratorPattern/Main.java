package org.example.lld.decoratorPattern;

import org.example.lld.decoratorPattern.basepizza.BasePizza;
import org.example.lld.decoratorPattern.basepizza.LightWeight;
import org.example.lld.decoratorPattern.basepizza.Magarita;
import org.example.lld.decoratorPattern.toppings.ExtraCheese;
import org.example.lld.decoratorPattern.toppings.Mushroom;

public class Main {
    public static void main(String[] args) {
        BasePizza basePizza = new Magarita();
        System.out.println(basePizza.cost());

        BasePizza basePizza1 = new ExtraCheese(basePizza);
        System.out.println(basePizza1.cost());

        BasePizza basePizza2 = new Mushroom(basePizza1);
        System.out.println(basePizza2.cost());

        BasePizza customizedPizza = new Mushroom(new ExtraCheese(new LightWeight()));
        System.out.println(customizedPizza.cost());

    }
}
