package src.java8.features.streams.terminaloperator;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamJoiningExample {
    public static void main(String[] args) {
        char[] ch = {'a', 'b', 'c', 'd', 'e'};
        String join = Stream.of(ch).map(arr -> new String(arr)).collect(Collectors.joining());
        System.out.println(join);
    }
}
