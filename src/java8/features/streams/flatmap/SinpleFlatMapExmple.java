package src.java8.features.streams.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SinpleFlatMapExmple {

    public static void main(String[] args) {

        List<Integer> oddNumbers = Arrays.asList(1, 3, 5, 7, 9);
        List<Integer> evenNumbers = Arrays.asList(2, 4, 6, 8, 10);

        List<List<Integer>> listOfList = Arrays.asList(oddNumbers, evenNumbers);
        System.out.println("BEFORE FLATTEN:" + listOfList);

        List<Integer> finalist = listOfList.stream().flatMap(List::stream).collect(Collectors.toList());
        System.out.println("FinalList::" + finalist);

        List<Integer> finalistSorted = listOfList.stream().flatMap(List::stream).sorted().collect(Collectors.toList());
        System.out.println("FinalList Sored::" + finalistSorted);
    }
}
