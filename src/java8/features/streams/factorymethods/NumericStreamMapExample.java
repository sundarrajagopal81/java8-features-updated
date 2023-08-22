package src.java8.features.streams.factorymethods;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamMapExample {
    public static void main(String[] args) {

        System.out.println("Map to double::" + map2Double());
        System.out.println("Map to long:" + map2Long());
        System.out.println("Map to object::" + mapToObject());
    }

    static double map2Double() {
        return IntStream.rangeClosed(1, 10) //holds primitive elements
                .mapToDouble(x -> x)// int to double
                .sum();// performing sum operation
    }

    static long map2Long() {
        return IntStream.rangeClosed(0, 10).mapToLong(x -> x).sum();
    }

    static List<Integer> mapToObject() {
        return IntStream.rangeClosed(1, 10).mapToObj(x -> x).collect(Collectors.toList());
    }
}
