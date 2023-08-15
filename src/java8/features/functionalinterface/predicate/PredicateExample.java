package src.java8.features.functionalinterface.predicate;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> lessthan = p -> p >= 50;
        Predicate<Integer> equal = p -> p == 50;
        boolean result = lessthan.and(equal).test(50);
        System.out.println(result);
    }
}
