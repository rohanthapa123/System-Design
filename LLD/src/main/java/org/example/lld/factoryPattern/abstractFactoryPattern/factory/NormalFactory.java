package org.example.lld.factoryPattern.abstractFactoryPattern.factory;

import org.example.lld.factoryPattern.abstractFactoryPattern.vehicle.Alto;
import org.example.lld.factoryPattern.abstractFactoryPattern.vehicle.Vehicle;

public class NormalFactory implements VehicleFactory{
    @Override
    public Vehicle getVehicleBrand(String Brand) {
        switch (Brand){
            case "ALTO":
                return new Alto();
            default:
                return null;
        }
    }
}
