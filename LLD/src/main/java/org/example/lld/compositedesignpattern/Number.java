package org.example.lld.compositedesignpattern;

public class Number implements ArithmeticExpression{
    public int number;
     public Number(int number){
         this.number = number;
     }

    @Override
    public int evaluate() {
        return number;
    }
}
