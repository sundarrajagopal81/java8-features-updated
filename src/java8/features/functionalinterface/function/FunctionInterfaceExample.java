package src.java8.features.functionalinterface.function;

import java.util.function.Function;

/**
 * /**
 * * public interface Function<T,R>
 * * Represents a function that accepts one argument and produces a result.
 * * This is a functional interface whose functional method is apply(Object).
 * *
 * * R apply(T t)
 * * Applies this function to the given argument.
 * * Parameters:
 * * t - the function argument
 * * Returns:
 * * the function result
 */

public class FunctionInterfaceExample {

    static Function<String, Integer> f1 = s -> s.length();
    static Function<String, String> f2 = s -> s.toUpperCase();
    static Function<String, String> f3 = s -> s.toUpperCase().concat(" features");

    public static void main(String[] args) {
        System.out.println("Length of the String::" + f1.apply("Sundar"));
        System.out.println("andThen : " + f2.andThen(f3).apply("java8"));
        System.out.println(("compose :" + f2.compose(f3).apply("hello")));

        Function<Integer, Integer> f4 = x -> x * 2;
        Function<Integer, Integer> f5 = x -> x * x;
        System.out.println("AndThen::" + f4.andThen(f5).apply(10));
        System.out.println("Compose::" + f4.compose(f5).apply(10));

        Function<String, String> identy = Function.identity();

        System.out.println("Identy:::" + identy.apply("Hello"));


    }
}
