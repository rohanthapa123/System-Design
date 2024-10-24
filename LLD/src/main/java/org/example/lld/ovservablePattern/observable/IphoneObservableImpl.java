package org.example.lld.ovservablePattern.observable;

import org.example.lld.ovservablePattern.observer.NotificationObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StockObservable {

    private List<NotificationObserver> observerList = new ArrayList<>();
    private int stockCount = 0;

    @Override
    public void add(NotificationObserver notificationObserver) {
        observerList.add(notificationObserver);
    }

    @Override
    public void remove(NotificationObserver notificationObserver) {
        observerList.remove(notificationObserver);
    }

    @Override
    public void notifySubscriber() {
        for(NotificationObserver observer : observerList){
            observer.update();
        }
    }

    @Override
    public void setStockCount(int newStock) {
        if(stockCount == 0){
            notifySubscriber();
        }
        stockCount+= newStock;
    }

    @Override
    public int getStockCount() {
        return  stockCount;
    }
}
