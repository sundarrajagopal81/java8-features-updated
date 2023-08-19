package src.java8.features.streams.map;

import src.java8.features.repo.Person;
import src.java8.features.repo.PersonRepository;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamPersonMapExample {

    static Function<String, String> perU = String::toUpperCase;
    static Function<String, String> perL = String::toLowerCase;

    static Function<String, String> per = per -> per.toLowerCase();


    static List<String> toUpperTransform(List<Person> listOfPerson) {
        // return listOfPerson.stream().map(Person::getName).map(String::toUpperCase).collect(Collectors.toList());
        return listOfPerson.stream().map(Person::getName).map(perU).collect(Collectors.toList());
    }


    static List<String> toLowerTransform(List<Person> listOfPerson) {
        return listOfPerson.stream().map(Person::getName).map(per).collect(Collectors.toList());
    }

    public static void main(String[] args) {

        System.out.println("UPPER::" + toUpperTransform(PersonRepository.getAllPersons()));
        System.out.println(("LOWER::" + toLowerTransform(PersonRepository.getAllPersons())));

    }
}
