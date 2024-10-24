package org.example.lld.factoryPattern.abstractFactoryPattern.factory;

import org.example.lld.factoryPattern.abstractFactoryPattern.vehicle.Bmw;
import org.example.lld.factoryPattern.abstractFactoryPattern.vehicle.Mercedes;
import org.example.lld.factoryPattern.abstractFactoryPattern.vehicle.Vehicle;

public class LuxuryFactory implements VehicleFactory{
    @Override
    public Vehicle getVehicleBrand(String Brand) {
        switch (Brand){
            case "MERCEDES":
                return new Mercedes();
            case "BMW":
                return new Bmw();
            default:
                return null;
        }
    }

}
