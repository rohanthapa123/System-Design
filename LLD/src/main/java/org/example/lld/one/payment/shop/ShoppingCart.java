package org.example.lld.one.payment.shop;

import org.example.lld.one.payment.strategy.PaymentStrategy;

public class ShoppingCart {
    public PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(int amount){
        paymentStrategy.pay(amount);
    }
}
