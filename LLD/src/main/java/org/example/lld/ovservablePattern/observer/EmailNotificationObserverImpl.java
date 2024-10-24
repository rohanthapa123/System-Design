package org.example.lld.ovservablePattern.observer;

import org.example.lld.ovservablePattern.observable.StockObservable;

public class EmailNotificationObserverImpl implements NotificationObserver{
    private String email;
    private StockObservable stockObservable;

    public EmailNotificationObserverImpl(String email, StockObservable observable){
        this.email = email;
        this.stockObservable = observable;
    }

    @Override
    public void update() {
        System.out.println("Alert sent to email : " + email);
    }
}
