package org.example.lld.facadeDesignPattern;

public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade(new DvdPlayer(), new Projector(), new TV());

        facade.watchMovieOnProjector();

        facade.watchMovieOnTv();
    }
}
