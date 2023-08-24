package src.java8.features.streams.sequentialparallel;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class SeqParallelStreamExample {
    public static void main(String[] args) {
        System.out.println("SeqSum::" + sumUsingSeq());
        System.out.println("SumParallel::" + sumUsingParallel());

        System.out.println("Duraion Using seq::" + checkPerformace(SeqParallelStreamExample::sumUsingSeq, 25));

        System.out.println("Duraion Using Parallel::" + checkPerformace(SeqParallelStreamExample::sumUsingParallel, 25));

    }

    static long checkPerformace(Supplier<Integer> sum, int numberOftime) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < numberOftime; i++) {
            sum.get();
        }
        long end = System.currentTimeMillis();
        return end - start;


    }

    static int sumUsingSeq() {
        return IntStream.rangeClosed(0, 100000).sum();
    }

    static int sumUsingParallel() {
        return IntStream.rangeClosed(0, 100000).parallel().sum();

    }
}
