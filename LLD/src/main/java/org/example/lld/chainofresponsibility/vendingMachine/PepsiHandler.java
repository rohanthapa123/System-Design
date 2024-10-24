package org.example.lld.chainofresponsibility.vendingMachine;

public class PepsiHandler extends VendingMachineHandler{

    public PepsiHandler(VendingMachineHandler nextVendingMachine) {
        super(nextVendingMachine);
    }

    @Override
    public void giveItem(String name) {
        if(name == "PEPSI")
            System.out.println("This is your pepsi");
        else
            super.giveItem(name);
    }
}
