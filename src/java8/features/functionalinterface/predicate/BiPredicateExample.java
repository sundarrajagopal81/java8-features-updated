package src.java8.features.functionalinterface.predicate;

import java.util.function.BiPredicate;

/**
 * Represents a predicate (boolean-valued function) of two arguments. This is the two-arity specialization of Predicate.
 * This is a functional interface whose functional method is test(Object, Object).
 * test
 * boolean test(T t,
 * U u)
 * Evaluates this predicate on the given arguments.
 * Parameters:
 * t - the first input argument
 * u - the second input argument
 * Returns:
 * true if the input arguments match the predicate, otherwise false
 */
public class BiPredicateExample {

    static BiPredicate<Integer, Integer> biPredicate = (a, b) -> a > 10 & b < 50;

    public static void main(String[] args) {

        System.out.println(biPredicate.test(15, 40));

    }
}
