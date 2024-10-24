package org.example.lld.one.payment.strategy;

public class CreditCardStrategy implements PaymentStrategy{
    public String creditCardNumber;

    public CreditCardStrategy(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Payment made with credit card of number " + creditCardNumber);
    }
}
