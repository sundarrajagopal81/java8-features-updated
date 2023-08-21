package src.java8.features.streams.minmax;

import src.java8.features.repo.Person;
import src.java8.features.repo.PersonRepository;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamMinMaxExample {
    static Optional<Person> getTallestPerson() {
        return PersonRepository.getAllPersons().stream().collect(Collectors.maxBy(Comparator.comparing(Person::getHeight)));
    }

    static Optional<Person> getShortestPerson() {
        return PersonRepository.getAllPersons().stream().collect(Collectors.minBy(Comparator.comparing(Person::getHeight)));
    }

    //Check max hight with equal more number of persons
    static List<Person> getMultiplePersons() {
        List<Person> personList = new ArrayList<>();

        Person tallest = getTallestPerson().get();


        if (null != tallest) {
            personList = PersonRepository.getAllPersons().stream().filter(per -> per.getHeight() == tallest.getHeight()).collect(Collectors.toList());
        }

        return personList;

    }

    public static void main(String[] args) {


        System.out.println("Tallest Person::" + getTallestPerson());
        System.out.println("Shortest Person::" + getShortestPerson());
        System.out.println("all person: " + getMultiplePersons());


    }
}
