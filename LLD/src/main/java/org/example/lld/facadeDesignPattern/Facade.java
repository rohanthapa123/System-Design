package org.example.lld.facadeDesignPattern;

public class Facade {

    DvdPlayer dvdPlayer;
    Projector projector;
    TV tv;

    public Facade(DvdPlayer dvdPlayer, Projector projector, TV tv){
        this.dvdPlayer = dvdPlayer;
        this.tv = tv;
        this.projector = projector;
    }

    public void watchMovieOnProjector(){
        dvdPlayer.on();
        projector.on();
        dvdPlayer.setVolume(30);
    }

    public void watchMovieOnTv(){
        dvdPlayer.on();
        tv.on();
        dvdPlayer.setVolume(50);
    }



}
