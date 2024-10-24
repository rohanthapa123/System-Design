package org.example.lld.tiktaktoe;

import org.example.lld.tiktaktoe.model.*;

import java.util.*;

public class TikTakToe {

    Deque<Player> players;
    Board gameboard;

    public TikTakToe() {
        initializeGame();
    }

    public void initializeGame(){
        //creating two players
        players = new LinkedList<>();

        PlayingPeace cross = new PlayingPeaceX();
        Player rohan = new Player("Rohan", cross);

        PlayingPeace aalu = new PlayingPeaceO();
        Player you = new Player("You" , aalu);

        players.add(rohan);
        players.add(you);

        System.out.println("Two Player Initialized");
        System.out.println("Player one is " + rohan.getName() + " with symbol " + rohan.getPeace().type);
        System.out.println("Player Two is " + you.getName() + " with symbol " + you.getPeace().type);

        gameboard = new Board(3); // can be made dynamic by taking value from constructor
    }

    public String startGame(){

        boolean noWinner = true;

        while (noWinner){
            Player currentPlayer = players.removeFirst();

            gameboard.printBoard();

            List<Map<Integer, Integer>> freeShells = gameboard.getFreeShells();

            if(freeShells.isEmpty()){
                noWinner=false;
                continue;
            }
            int row, col;
            try{
                System.out.println("Player "+ currentPlayer.getName() + " turn");
                System.out.println("Enter coordinate in 0,1 format");
                Scanner sc = new Scanner(System.in);
                String input = sc.nextLine();
                String[] arrInput = input.split(",");
                row = Integer.valueOf(arrInput[0]);
                col = Integer.valueOf(arrInput[1]);
            }catch (Exception ex){
                System.out.println("Invalid Format");
                continue;
            }

            Boolean addToBoard = gameboard.addPiece(row, col, currentPlayer.getPeace());
            if(!addToBoard){
                System.out.println("Please add in a valid place");
                players.addFirst(currentPlayer);
                continue;
            }

            players.addLast(currentPlayer);
            boolean winner = isThereWinner(row, col, currentPlayer.getPeace().type );
            if(winner){
                gameboard.printBoard();
                return currentPlayer.getName();
            }

        }

        return "tie";
    }

    private boolean isThereWinner(int row, int col, PeaceType type) {

        Boolean rowMatch = true;
        Boolean colMatch = true;
        Boolean diagonalMatch = true;
        Boolean antiDiagonalMatch = true;

        for(int i = 0; i < gameboard.getSize(); i++){
            if(gameboard.board[row][i] == null || gameboard.board[row][i].type != type ){
                rowMatch=false;
            }
        }


        for(int i = 0; i < gameboard.getSize(); i++){
            if(gameboard.board[i][col] == null || gameboard.board[i][col].type != type ){
                colMatch=false;
            }
        }

        for(int i = 0 , j = 0; i < gameboard.getSize(); i++,j++){
            if(gameboard.board[i][j] == null || gameboard.board[i][j].type != type){
                diagonalMatch=false;
            }
        }

        for(int i =0, j = gameboard.getSize() -1; i < gameboard.getSize(); i++,j--){
                    if(gameboard.board[i][j] == null || gameboard.board[i][j].type != type){
                        antiDiagonalMatch=false;
                    }
                }


        return rowMatch || colMatch || diagonalMatch || antiDiagonalMatch;
    }
}
