package src.java8.features.streams.filter;

import src.java8.features.repo.Person;
import src.java8.features.repo.PersonRepository;

import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamFilterPersonExample {
    static Predicate<Person> height = person -> person.getHeight() >= 140;
    static Predicate<Person> gender = person -> person.getGender().equals("Male");
    static Predicate<Person> salary = person -> person.getSalary() > 5000;

    public static void main(String[] args) {
        PersonRepository.getAllPersons().stream().filter(height.and(gender).and(salary)).collect(Collectors.toList())
                .forEach(System.out::println);


    }
}
