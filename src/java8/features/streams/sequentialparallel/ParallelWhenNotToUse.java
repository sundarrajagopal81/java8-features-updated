package src.java8.features.streams.sequentialparallel;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelWhenNotToUse {
    public static void main(String[] args) {

        List<Integer> intList = IntStream.rangeClosed(1, 100000).boxed().collect(Collectors.toList());
        System.out.println("SeqCal::" + seqCalculation(intList));
        System.out.println("Parallel::" + parallelCalculation(intList)); // paralle will be slow here as there are some calculations are there
    }

    static int seqCalculation(List<Integer> list) {
        long start = System.currentTimeMillis();
        int total = list.stream().reduce(0, (x, y) -> x + y);
        long end = System.currentTimeMillis();
        System.out.println("Sequential Duration::" + (end - start));
        return total;
    }


    static int parallelCalculation(List<Integer> list) {
        long start = System.currentTimeMillis();
        int total = list.stream().parallel().reduce(0, (x, y) -> x + y);
        long end = System.currentTimeMillis();
        System.out.println("Parallel Duration::" + (end - start));
        return total;
    }


}
