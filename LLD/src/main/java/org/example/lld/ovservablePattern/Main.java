package org.example.lld.ovservablePattern;

import org.example.lld.ovservablePattern.observable.IphoneObservableImpl;
import org.example.lld.ovservablePattern.observable.StockObservable;
import org.example.lld.ovservablePattern.observer.EmailNotificationObserverImpl;
import org.example.lld.ovservablePattern.observer.NotificationObserver;
import org.example.lld.ovservablePattern.observer.PhoneNotificationObserverImpl;

public class Main {
    public static void main(String[] args) {

        StockObservable observable = new IphoneObservableImpl();

        NotificationObserver observer1 = new EmailNotificationObserverImpl("abcd@gmail.com", observable);
        NotificationObserver observer2 = new PhoneNotificationObserverImpl("abcd@gmail.com", observable);
        NotificationObserver observer3 = new EmailNotificationObserverImpl("abcd@gmail.com", observable);

        observable.add(observer1);
        observable.add(observer2);
        observable.add(observer3);

        System.out.println(observable.getStockCount());

        observable.setStockCount(25);
    }
}
