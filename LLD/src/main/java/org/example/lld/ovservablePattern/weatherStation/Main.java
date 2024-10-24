package org.example.lld.ovservablePattern.weatherStation;

import org.example.lld.ovservablePattern.weatherStation.observable.WeatherStation;
import org.example.lld.ovservablePattern.weatherStation.observer.AverageTemperatureDisplay;
import org.example.lld.ovservablePattern.weatherStation.observer.CurrentTemperatureDisplay;
import org.example.lld.ovservablePattern.weatherStation.observer.Observer;

public class Main {
    public static void main(String[] args) {
        WeatherStation ws = new WeatherStation();

        Observer cr = new CurrentTemperatureDisplay();
        Observer ar = new AverageTemperatureDisplay();

        ws.registerObserver(cr);
        ws.registerObserver(ar);

        ws.setTemperature(89.5f);
        ws.setTemperature(30.5f);

    }
}
