package org.example.lld.nullobjectpattern;

public class VehicleFactory {
    public static Vehicle getVehicleDetail(String vehicle){
        if(vehicle == "CAR"){
            return new Car();
        }
        return new NullObject();
    }
}
