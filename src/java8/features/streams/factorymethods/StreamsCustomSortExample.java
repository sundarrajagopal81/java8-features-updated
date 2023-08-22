package src.java8.features.streams.factorymethods;

import src.java8.features.repo.Person;
import src.java8.features.repo.PersonRepository;

import java.util.Comparator;

public class StreamsCustomSortExample {
    public static void main(String[] args) {
        System.out.println("Sort by name");
        PersonRepository.getAllPersons().stream().sorted(Comparator.comparing(Person::getName)).forEach(
                (System.out::println));

        System.out.println("Sort by Height");
        PersonRepository.getAllPersons().stream().sorted(Comparator.comparing(Person::getHeight)).forEach(System.out::println);

        System.out.println("Sort by Height Reversed");
        PersonRepository.getAllPersons().stream().sorted(Comparator.comparing(Person::getHeight).reversed()).forEach(System.out::println);

    }
}
