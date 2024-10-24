package org.example.lld.tiktaktoe.model;

public class Player {
    String name;
    PlayingPeace peace;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlayingPeace getPeace() {
        return peace;
    }

    public void setPeace(PlayingPeace peace) {
        this.peace = peace;
    }

    public Player(String  name, PlayingPeace peace){
        this.name = name;
        this.peace = peace;
    }
}
