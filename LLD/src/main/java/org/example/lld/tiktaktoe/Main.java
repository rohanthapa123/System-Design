package org.example.lld.tiktaktoe;

public class Main {
    public static void main(String[] args) {
        TikTakToe game = new TikTakToe();
        System.out.println("The winner of the game is " + game.startGame());
    }
}
