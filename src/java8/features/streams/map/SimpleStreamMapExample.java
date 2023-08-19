package src.java8.features.streams.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SimpleStreamMapExample {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Orange", "Apple", "Banana", "PineApple");

        List<Integer> fruitLengths = fruits.stream()
                //.map(String::length) // Method reference
                .map(s -> s.length()) //Lamda expression
                .collect(Collectors.toList());
        System.out.println("Fruits size" + fruitLengths);
    }
}
