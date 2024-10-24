package org.example.lld.adapterdesignpattern;

import org.example.lld.adapterdesignpattern.adapter.DistanceMachineAdapter;
import org.example.lld.adapterdesignpattern.adapter.DistanceMachineAdapterImpl;
import org.example.lld.adapterdesignpattern.distancemachine.DistanceMachineForHills;

public class Main {
    public static void main(String[] args) {
        DistanceMachineAdapter distanceMachineAdapter = new DistanceMachineAdapterImpl(new DistanceMachineForHills());
        System.out.println(distanceMachineAdapter.getDistanceInKm());

    }
}
