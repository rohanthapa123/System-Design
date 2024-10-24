package org.example.lld.one.payment;

import org.example.lld.one.payment.shop.ShoppingCart;
import org.example.lld.one.payment.strategy.BitCoinStrategy;
import org.example.lld.one.payment.strategy.CreditCardStrategy;
import org.example.lld.one.payment.strategy.PayPalStrategy;

public class Main {
    public static void main(String[] args) {
        ShoppingCart myCart = new ShoppingCart();

        myCart.setPaymentStrategy(new CreditCardStrategy("5014-8745-4785-9684"));
        myCart.checkout(5000);

        myCart.setPaymentStrategy(new PayPalStrategy("thaparohan2019@gmail.com"));
        myCart.checkout(15000);

        myCart.setPaymentStrategy(new BitCoinStrategy("1Lbcfr7sAHTD9CgdQo3HTMTkV8LK4ZnX71"));
        myCart.checkout(1);

    }
}
