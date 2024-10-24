package org.example.lld.facadeDesignPattern;

public class DvdPlayer {
    public void on(){
        System.out.println("DVD is on");
    }
    public void setVolume(int vol){
        System.out.println("Volume set to " + vol);
    }
    public void off(){
        System.out.println("DVD is off");
    }
}
