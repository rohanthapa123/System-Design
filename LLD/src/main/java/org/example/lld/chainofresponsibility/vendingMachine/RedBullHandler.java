package org.example.lld.chainofresponsibility.vendingMachine;

public class RedBullHandler extends VendingMachineHandler{

    public RedBullHandler(VendingMachineHandler nextVendingMachine) {
        super(nextVendingMachine);
    }

    @Override
    public void giveItem(String name) {
        if(name == "REDBULL")
            System.out.println("This is your Redbull");
        else
            super.giveItem(name);
    }
}
