package org.example.lld.nullobjectpattern;

public class Car implements Vehicle{
    @Override
    public int getFuelTankCapacity() {
        return 70;
    }

    @Override
    public int getSittingCapacity() {
        return 5;
    }
}
