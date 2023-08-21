package src.java8.features.streams.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class StreamReduceExample {
    static BinaryOperator<Integer> bo = (a, b) -> (a + b);
    static BinaryOperator<Integer> bo1 = (a, b) -> (a * b);

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> sum = numbers.stream().reduce(bo);
        System.out.println("SUM is::" + sum.get());


        int sum1 = numbers.stream().mapToInt(i -> i).sum();

        System.out.println("sum maptoInt:::" + sum1);
        int mul = numbers.stream().reduce(1, bo1);//we cannot pass the first param as 0 the multiply will not work propertly
        System.out.println(mul);
        int add = numbers.stream().reduce(0, bo); //we cannot pass first param as 1 as this will change the values.
        System.out.println(add);


    }
}
