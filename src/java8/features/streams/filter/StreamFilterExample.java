package src.java8.features.streams.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFilterExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("sundar", "snow", "abc", "Mercy");
        Stream<String> filteredNames = names.stream().filter(s -> s.length() > 3);
        filteredNames.forEach(System.out::println);
        System.out.println("################");
        List<String> listFilteredNames = names.stream().filter(s -> s.length() > 3).collect(Collectors.toList());
        listFilteredNames.forEach(System.out::println);
    }
}
