package org.example.lld.ovservablePattern.weatherStation.observable;

import org.example.lld.ovservablePattern.weatherStation.observer.Observer;

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
}
