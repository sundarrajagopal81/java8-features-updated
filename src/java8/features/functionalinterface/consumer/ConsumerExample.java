package src.java8.features.functionalinterface.consumer;

import java.util.function.Consumer;

/**
 * Represents an operation that accepts a simple  input argument and return a no result.
 * This is a functional interface whose functional methods is accept(Object).
 */
public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> c1 = s -> System.out.println(s.toUpperCase());
        c1.accept("java 8 features");
        Consumer<String> c2 = s -> System.out.println(s.toLowerCase());
        c2.accept("SUNDAR");
        //andThen is a default method from the Consumer functional interface
        //same type of consumers can be clubed together. like here is String is a common type
        //if incase of different datatypes we cannot use the andThen mehtod.
        c1.andThen(c2).accept("Sundar Rajagopal");
        Consumer<Integer> c3 = x -> System.out.println(x + 10);
        Consumer<Integer> c4 = x -> System.out.println(x + 100);
        c3.andThen(c4).accept(50);
    }
}
