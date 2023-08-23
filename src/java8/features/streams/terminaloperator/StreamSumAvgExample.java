package src.java8.features.streams.terminaloperator;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSumAvgExample {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int total = intList.stream().collect(Collectors.summingInt(Integer::intValue));
        System.out.println("Total::" + total);
        double avg = intList.stream().collect(Collectors.averagingInt(Integer::intValue));
        System.out.println("AVG::" + avg);
    }
}
