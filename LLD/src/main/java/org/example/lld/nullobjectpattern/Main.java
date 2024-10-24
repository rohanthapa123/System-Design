package org.example.lld.nullobjectpattern;

public class Main {
    public static void main(String[] args) {

        Vehicle vehicle = VehicleFactory.getVehicleDetail("BIKE");
        vehicleDetail(vehicle);
    }

    public static void vehicleDetail(Vehicle vehicle){
        System.out.println(vehicle.getFuelTankCapacity());
        System.out.println(vehicle.getSittingCapacity());
    }
}
