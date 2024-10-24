package org.example.lld.ovservablePattern.weatherStation.observable;

import org.example.lld.ovservablePattern.weatherStation.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {

    private List<Observer> observers;
    private float temperature;
    public WeatherStation(){
        observers = new ArrayList<>();
    }
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer:observers){
            observer.update(temperature);
        }
    }
    public void setTemperature(float temperature){
        this.temperature = temperature;
        notifyObserver();
    }

}
