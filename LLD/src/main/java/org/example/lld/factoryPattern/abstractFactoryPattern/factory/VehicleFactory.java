package org.example.lld.factoryPattern.abstractFactoryPattern.factory;


import org.example.lld.factoryPattern.abstractFactoryPattern.vehicle.Vehicle;

public interface VehicleFactory {
    Vehicle getVehicleBrand(String brand);
}
