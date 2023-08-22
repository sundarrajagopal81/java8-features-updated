package src.java8.features.streams.factorymethods;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.IntStream;

public class NumericStreamExample {

    static BinaryOperator<Integer> bo = (x, y) -> x + y;

    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(CalculateSumUsingStream(l1));
        System.out.println("@@@@@@@@@@@@@@");
        IntStream l2 = IntStream.rangeClosed(0, 10);
        System.out.println(CalculateSumUsingIntStream(l2));
    }

    static int CalculateSumUsingStream(List<Integer> list) {
        return list.stream().reduce(0, bo);
    }

    static int CalculateSumUsingIntStream(IntStream intStream) {
        return intStream.sum();
    }
}
