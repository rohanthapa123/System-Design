package org.example.lld.chainofresponsibility.vendingMachine;

public class CokeHandler extends VendingMachineHandler{
    public CokeHandler(VendingMachineHandler nextVendingMachine) {
        super(nextVendingMachine);
    }

    @Override
    public void giveItem(String name) {
        if(name == "COKE"){
            System.out.println("Giving Coke to you");
        }else{
            super.giveItem(name);
        }
    }
}
