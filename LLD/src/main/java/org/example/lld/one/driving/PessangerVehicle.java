package org.example.lld.one.driving;

import org.example.lld.one.driving.strategy.NormalStrategy;

public class PessangerVehicle extends Vehicle{
    public PessangerVehicle() {
        super(new NormalStrategy());
    }
}
