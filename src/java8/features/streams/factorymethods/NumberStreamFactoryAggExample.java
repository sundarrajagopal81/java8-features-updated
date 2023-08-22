package src.java8.features.streams.factorymethods;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class NumberStreamFactoryAggExample {
    public static void main(String[] args) {
        int sum = IntStream.rangeClosed(0, 10).sum();
        System.out.println("SUM::" + sum);

        OptionalInt max = IntStream.rangeClosed(0, 10).max();
        System.out.println("MAX:" + max.getAsInt());
        OptionalInt min = IntStream.rangeClosed(0, 10).min();
        System.out.println("MIN:" + min.getAsInt());
        OptionalDouble avg = IntStream.rangeClosed(0, 10).average();
        System.out.println("AVG::" + avg.getAsDouble());

    }
}
