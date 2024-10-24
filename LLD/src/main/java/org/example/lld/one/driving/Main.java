package org.example.lld.one.driving;

public class Main {
    public static void main(String[] args) {
        Vehicle superCar = new SuperCar();
        superCar.drive();
        Vehicle offraoder = new Offroad();
        offraoder.drive();
        Vehicle bus = new PessangerVehicle();
        bus.drive();
    }
}
