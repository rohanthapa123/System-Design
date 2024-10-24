package org.example.lld.ovservablePattern.weatherStation.observer;

public class CurrentTemperatureDisplay implements Observer{

    private float temp;

    @Override
    public void update(float temperature) {
        this.temp = temperature;
        display();
    }

    public void display(){
        System.out.println("Current temperature is " + temp + " deg celcius");
    }

}