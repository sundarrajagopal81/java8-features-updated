package src.java8.features.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaOldVsJava8Example {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Sundar", "Snow", "Mercy", "Sundar");
        //Before Java 8
        List<String> uniqueList = new ArrayList<>();
        for (String name : names) {
            if (!uniqueList.contains(name)) {
                uniqueList.add(name);
            }
        }
        System.out.println("BEFOR Java8: " + uniqueList);
        //After java 8
        List<String> uniqueList1 = names.stream().distinct().collect(Collectors.toList());
        System.out.println("In Java8: " + uniqueList1);


    }
}
