package org.example.lld.chainofresponsibility.vendingMachine;

public abstract class VendingMachineHandler {

    VendingMachineHandler nextVendingMachine;

    public VendingMachineHandler(VendingMachineHandler nextVendingMachine){
        this.nextVendingMachine = nextVendingMachine;
    }

    public void giveItem(String name){
        if(nextVendingMachine != null){
            nextVendingMachine.giveItem(name);
        }
    }

}
