package org.example.lld.compositedesignpattern;

public class Main {
    public static void main(String[] args) {
        ArithmeticExpression one = new Number(1);
        ArithmeticExpression two = new Number(2);
        ArithmeticExpression four = new Number(4);

        ArithmeticExpression add = new Expression(four, one, Operation.ADD);
        ArithmeticExpression mul = new Expression(add, two, Operation.MULTIPLY);

        System.out.println(mul.evaluate());
    }
}
