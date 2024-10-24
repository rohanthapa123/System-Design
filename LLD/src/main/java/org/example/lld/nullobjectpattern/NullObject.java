package org.example.lld.nullobjectpattern;

public class NullObject implements Vehicle{
    @Override
    public int getFuelTankCapacity() {
       return  0;
    }

    @Override
    public int getSittingCapacity() {
        return 0;
    }
}
