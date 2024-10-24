package org.example.lld.ovservablePattern.observable;

import org.example.lld.ovservablePattern.observer.NotificationObserver;

public interface StockObservable {

    void add(NotificationObserver notificationObserver);

    void remove(NotificationObserver notificationObserver);

    void notifySubscriber();

    void setStockCount(int newStock);

    int getStockCount();

}
