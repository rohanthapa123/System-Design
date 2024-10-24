package org.example.lld.one.payment.strategy;

public class PayPalStrategy implements PaymentStrategy{

    public String email;

    public PayPalStrategy(String email){
        this.email = email;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Payment made with email of " + email);
    }
}
