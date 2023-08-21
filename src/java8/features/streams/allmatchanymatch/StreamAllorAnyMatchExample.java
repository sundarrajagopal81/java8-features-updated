package src.java8.features.streams.allmatchanymatch;

import src.java8.features.repo.Person;
import src.java8.features.repo.PersonRepository;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamAllorAnyMatchExample {
    static Predicate<String> p1 = s1 -> s1.length() > 4;
    static Predicate<String> p2 = s1 -> s1.length() > 7;
    static Predicate<Person> p3 = per -> per.getHeight() >= 140;


    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Orange", "Banana", "PineApple");
        System.out.println("All Match::" + fruits.stream().allMatch(p2));
        System.out.println("AnyMatch::" + fruits.stream().anyMatch(p1));


        boolean personAllMatch = PersonRepository.getAllPersons().stream().allMatch(p3);
        System.out.println("Person All match ::" + personAllMatch);

        boolean personAnyMatch = PersonRepository.getAllPersons().stream().anyMatch(p3);
        System.out.println("Person Any match ::" + personAnyMatch);
    }
}