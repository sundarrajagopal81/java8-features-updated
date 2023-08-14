package src.java8.features.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

/**
 * Represent an operation  that accepts two input arguments and returns no result.
 * This is a functional interface whose functional  method is accept(Object, Object)
 */
public class BiConsumerExample {

    public static void main(String[] args) {
        BiConsumer<Integer, Integer> biConsumer1 = (a, b) -> System.out.println("ADD: " + (a + b));
        BiConsumer<Integer, Integer> biConsumer2 = (a, b) -> System.out.println("Sub: " + (a - b));
        biConsumer1.accept(10, 20);
        biConsumer2.accept(50, 40);
        biConsumer1.andThen(biConsumer2).accept(50, 30);


        List<Integer> l1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> l2 = Arrays.asList(1, 2, 3);

        BiConsumer<List<Integer>, List<Integer>> sizeCheck = (list1, list2) -> {
            if (list1.size() == list2.size()) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        };
        sizeCheck.accept(l1, l2);


    }
}
