package src.java8.features.streams.allmatchanymatch;

import java.util.Arrays;
import java.util.List;

public class StreamLimitSkipExample {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Orange", "Grape", "Banana", "Pineapple");
        fruits.stream().limit(3).forEach(System.out::println);

        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6);
        int sum = intList.stream().limit(3).reduce(0, (a, b) -> a + b);
        System.out.println("Sum::" + sum);

        int skip = intList.stream().skip(3).reduce(0, (a, b) -> a + b);
        System.out.println("SIKP sum:" + skip);

    }
}
