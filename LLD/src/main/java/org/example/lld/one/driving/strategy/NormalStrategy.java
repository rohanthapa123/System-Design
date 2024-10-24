package org.example.lld.one.driving.strategy;

public class NormalStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Driving normally");
    }
}
