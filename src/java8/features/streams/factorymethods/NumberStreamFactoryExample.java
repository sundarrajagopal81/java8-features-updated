package src.java8.features.streams.factorymethods;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumberStreamFactoryExample {
    public static void main(String[] args) {
        IntStream i1 = IntStream.range(0, 6);
        IntStream i2 = IntStream.rangeClosed(1, 10);
        i1.forEach(System.out::println);
        System.out.println("##################");
        i2.forEach(System.out::println);

        LongStream.rangeClosed(1, 50).forEach(System.out::println);
        System.out.println("@@@@@@@@@@@@@@");

        DoubleStream ds = LongStream.rangeClosed(1, 50).asDoubleStream();
        ds.forEach(System.out::println);
    }
}
