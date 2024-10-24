package org.example.lld.one.driving;

import org.example.lld.one.driving.strategy.SpecialDrive;

public class Offroad extends Vehicle{
    public Offroad() {
        super(new SpecialDrive());
    }
}
