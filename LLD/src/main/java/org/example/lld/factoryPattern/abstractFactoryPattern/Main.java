package org.example.lld.factoryPattern.abstractFactoryPattern;

import org.example.lld.factoryPattern.abstractFactoryPattern.factory.VehicleFactory;
import org.example.lld.factoryPattern.abstractFactoryPattern.factory.VehicleCategoryFactory;
import org.example.lld.factoryPattern.abstractFactoryPattern.vehicle.Vehicle;

public class Main {
    public static void main(String[] args) {
        VehicleCategoryFactory factoryv1 = new VehicleCategoryFactory();
        VehicleFactory luxury = factoryv1.getVehicleCategory("LUXURY");
        Vehicle v1 = luxury.getVehicleBrand("BMW");
        v1.getAverage();

        VehicleFactory normal = factoryv1.getVehicleCategory("NORMAL");
        Vehicle v2 = normal.getVehicleBrand("ALTO");
        v2.getAverage();


    }
}
