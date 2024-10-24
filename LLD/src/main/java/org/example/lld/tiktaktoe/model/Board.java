package org.example.lld.tiktaktoe.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Board {
    int size;
    public PlayingPeace[][] board;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Board(int size){
        this.size = size;
        board = new PlayingPeace[size][size];
    }

    public boolean addPiece(int row, int column , PlayingPeace peace){
        if(board[row][column] != null){
            return  false;
        }
        board[row][column] = peace;
        return true;
    }

    public List<Map<Integer, Integer>> getFreeShells(){
        List<Map<Integer, Integer>> freeShells = new ArrayList<>();

        for(int i = 0 ; i < size; i++){
            for(int j = 0 ; j < size ; j++){
                if(board[i][j] == null){
                    Map<Integer, Integer> rowcol = new HashMap<>();
                    rowcol.put(i,j);
                    freeShells.add(rowcol);
                }
            }
        }


        return freeShells;
    }

    public void printBoard(){
        System.out.println("Board");
        for(int i = 0 ; i < size ; i++){
            for(int j = 0 ; j < size ; j++){
                if(board[i][j] != null) {
                    System.out.print(board[i][j].type);
                }else{
                    System.out.print(" ");
                }
                if(j < size-1)
                    System.out.print(" | ");
            }
            System.out.print("\n");
            if(i < size -1 )
                System.out.println("----------");
        }
    }

}
