package org.example.lld.one.driving;

import org.example.lld.one.driving.strategy.SpecialDrive;

public class SuperCar extends Vehicle{

    public SuperCar() {
        super(new SpecialDrive());
    }
}
