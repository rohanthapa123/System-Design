package org.example.lld.one.payment.strategy;

public class BitCoinStrategy implements PaymentStrategy{

    public String BitcoinWallet;

    public BitCoinStrategy(String bitcoinWallet) {
        BitcoinWallet = bitcoinWallet;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Payment made with Bitcoin wallet id " + BitcoinWallet);
    }
}
