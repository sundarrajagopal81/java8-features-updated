package src.java8.features.streams.reduce;

import src.java8.features.repo.Person;
import src.java8.features.repo.PersonRepository;

import java.util.Optional;
import java.util.function.Predicate;


public class StreamReducePersonExample {

    static Predicate<Person> height = per -> per.getHeight() >= 140;
    static Predicate<Person> gender = per -> per.getGender().equals("Male");

    public static void main(String[] args) {
        combineName();
        getTallestPerson();
        getKidsCount();
    }

    static void combineName() {
        String name = PersonRepository.getAllPersons().stream().map(Person::getName).reduce("", (a, b) -> a.concat(b));
        System.out.println(name);
    }

    static void getTallestPerson() {
        Optional<Person> tallest = PersonRepository.getAllPersons().stream().reduce((x, y) -> x.getHeight() >
                y.getHeight() ? x : y);
        System.out.println(tallest.get());

    }

    // Filter and reduce
    static void getKidsCount() {
        Optional<Integer> count = PersonRepository.getAllPersons().stream().filter(height.and(gender)).map(Person::getKids).reduce((x, b) -> (x + b));
        System.out.println("Kids Count::" + count.get());

    }
}
