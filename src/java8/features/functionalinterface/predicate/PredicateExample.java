package src.java8.features.functionalinterface.predicate;

import java.util.function.Predicate;

/**
 * Representa predicate (boolean valued function) of one argument
 * This functional interface whose functional method is test(Object)
 * <p>
 * boolean test(T t)
 * Evaluates this predicate on the given argument.
 * Parameters:
 * t - the input argument
 * Returns:
 * true if the input argument matches the predicate, otherwise false
 */
public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> lessthan = p -> p >= 50;
        Predicate<Integer> equal = p -> p == 50;
        boolean result = lessthan.and(equal).test(50);
        System.out.println(result);

        System.out.println(lessthan.or(equal).test(50));
        System.out.println();

    }
}
