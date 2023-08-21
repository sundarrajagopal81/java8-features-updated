package src.java8.features.streams.find;

import src.java8.features.repo.Person;
import src.java8.features.repo.PersonRepository;

import java.util.Optional;
import java.util.function.Predicate;

public class StreamFindAnyFindFirstExample {

    static Predicate<Person> p3 = per -> per.getHeight() < 150;

    static Optional<Person> findAnyMethod() {
        return PersonRepository.getAllPersons().stream().filter(p3).findAny();
    }

    static Optional<Person> findFirstMethod() {
        return PersonRepository.getAllPersons().stream().filter(p3).findFirst();
    }

    public static void main(String[] args) {

        Optional<Person> findAny = findAnyMethod();
        if (findAny.isPresent()) {
            System.out.println(findAny.get());
        } else {
            System.out.println("No record found...");
        }

        Optional<Person> findFirst = findFirstMethod();
        if (findFirst.isPresent()) {
            System.out.println(findFirst.get());
        } else {
            System.out.println("No record found...");
        }

    }
}
