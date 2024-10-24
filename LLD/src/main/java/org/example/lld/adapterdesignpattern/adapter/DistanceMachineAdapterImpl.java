package org.example.lld.adapterdesignpattern.adapter;

import org.example.lld.adapterdesignpattern.distancemachine.DistanceMachine;
import org.example.lld.adapterdesignpattern.distancemachine.DistanceMachineForHills;

public class DistanceMachineAdapterImpl implements DistanceMachineAdapter{

    DistanceMachine distanceMachine;

    public DistanceMachineAdapterImpl(DistanceMachineForHills distanceMachine){
        this.distanceMachine = distanceMachine;
    }

    @Override
    public int getDistanceInKm() {
        int distanceInMiles = distanceMachine.getDistanceInMiles();
        int distanceInKm = (int) (distanceInMiles * 0.6);
        return distanceInKm;
    }
}
