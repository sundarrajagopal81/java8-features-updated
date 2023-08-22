package src.java8.features.streams.factorymethods;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamBoxingUnboxingExample {
    public static void main(String[] args) {
        // boxingMethod().forEach(System.out::println);// boxing method prints 1 to 100.
        System.out.println(calculateSum(boxingMethod()));
    }

    static List<Integer> boxingMethod() {
        return IntStream.rangeClosed(0, 100) //range of primitive int
                .boxed() //stream of wrapper integer
                .collect(Collectors.toList());
    }

    static int calculateSum(List<Integer> li) {
        return li.stream().mapToInt(Integer::intValue).sum();
    }
}
