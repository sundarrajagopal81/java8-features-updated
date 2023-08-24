package src.java8.features.streams.sequentialparallel;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.stream.Stream;

public class SequentialStreamExample {
    public static void main(String[] args) {
        System.out.println("Available Cores::" + Runtime.getRuntime().availableProcessors());
        String arr[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

        System.out.println("Sequential run::");

        printStream(Arrays.stream(arr));
        System.out.println("Parallel Stream run::");
        printStream(Arrays.stream(arr).parallel());

    }

    static void printStream(Stream data) {
        data.forEach(s -> {
            System.out.println(LocalTime.now() + "Value :" + s + ":" + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
