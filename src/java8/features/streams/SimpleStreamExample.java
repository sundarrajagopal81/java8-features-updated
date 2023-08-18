package src.java8.features.streams;

import java.util.stream.Stream;

public class SimpleStreamExample {
    public static void main(String[] args) {
        Stream<Integer> s1 = Stream.of(1,2,3,4,5,6);
        s1.forEach(p-> System.out.println(p));

        Integer arr[] = new Integer[] {1,2,3,4,5};
        Stream<Integer> s2 = Stream.of(arr);
        s2.forEach(p-> System.out.println(p));

    }
}
