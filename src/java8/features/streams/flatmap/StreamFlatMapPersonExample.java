package src.java8.features.streams.flatmap;

import src.java8.features.repo.Person;
import src.java8.features.repo.PersonRepository;

import java.util.List;
import java.util.stream.Collectors;

public class StreamFlatMapPersonExample {

    static List<String> hobbies(List<Person> personList) {

        return personList.stream().map(Person::getHobbies).flatMap(List::stream).collect(Collectors.toList());
    }

    static List<String> hobbiesDistinctAndSorted(List<Person> personList) {

        return personList.stream().map(Person::getHobbies).flatMap(List::stream).distinct().sorted().collect(Collectors.toList());
    }

    static long countOfHobbies(List<Person> personList) {

        return personList.stream().map(Person::getHobbies).flatMap(List::stream).count();
    }

    public static void main(String[] args) {

        System.out.println("Persons Hobbies::" + hobbies(PersonRepository.getAllPersons()));

        System.out.println("Persons Hobbies Sorted and Distinct::" + hobbiesDistinctAndSorted(PersonRepository.getAllPersons()));

        System.out.println("Persons Hobbies Sorted and Distinct::" + countOfHobbies(PersonRepository.getAllPersons()));

    }
}
