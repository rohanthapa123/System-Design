package org.example.lld.chainofresponsibility.vendingMachine;

public class Main {
    public static void main(String[] args) {
        VendingMachineHandler myHandler = new CokeHandler(new PepsiHandler(new RedBullHandler(null)));

        myHandler.giveItem("REDBULL");
        myHandler.giveItem("PEPSI");
        myHandler.giveItem("COKE");
    }
}
