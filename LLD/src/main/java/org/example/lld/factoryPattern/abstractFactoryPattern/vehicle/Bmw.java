package org.example.lld.factoryPattern.abstractFactoryPattern.vehicle;

public class Bmw implements Vehicle {
    @Override
    public void getAverage() {
        System.out.println("This gives an average of 11 mpg");
    }
}
