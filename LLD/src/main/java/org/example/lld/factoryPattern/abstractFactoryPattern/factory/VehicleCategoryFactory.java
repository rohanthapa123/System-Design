package org.example.lld.factoryPattern.abstractFactoryPattern.factory;

public class VehicleCategoryFactory {
    public VehicleFactory getVehicleCategory(String vehicle){
        switch (vehicle){
            case "LUXURY":
                return new LuxuryFactory();
            case "NORMAL":
                return  new NormalFactory();
            default:
                return  null;
        }
    }
}
