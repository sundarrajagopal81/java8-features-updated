package src.java8.features.functionalinterface.operator;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryBinaryOperatorExample {

    static UnaryOperator<String> uo1 = name -> name.toUpperCase();
    static UnaryOperator<Integer> uo2 = number -> number * number;

    static Comparator<Integer> comp = (a, b) -> a.compareTo(b); // comparator is needed for the Binary Operator

    public static void main(String[] args) {
        System.out.println(uo1.apply("sundarR"));
        System.out.println(uo2.apply(20));
        BinaryOperator bo1 = BinaryOperator.minBy(comp);
        BinaryOperator bo2 = BinaryOperator.maxBy(comp);
        System.out.println(bo1.apply(10, 20));
        System.out.println(bo2.apply(30, 40));

    }
}
