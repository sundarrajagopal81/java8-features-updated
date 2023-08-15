package src.java8.features.functionalinterface.predicate;

import java.util.function.BiPredicate;

public class BiPredicateExample {

    static BiPredicate<Integer, Integer> biPredicate = (a, b) -> a > 10 & b < 50;

    public static void main(String[] args) {

        System.out.println(biPredicate.test(15, 40));

    }
}
