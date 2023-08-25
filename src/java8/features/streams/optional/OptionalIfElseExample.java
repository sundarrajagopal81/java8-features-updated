package src.java8.features.streams.optional;

import src.java8.features.repo.Person;
import src.java8.features.repo.PersonRepository;

import java.util.Optional;

public class OptionalIfElseExample {
    public static void main(String[] args) {

        // orElse();
        // orElseGet();
        orElseGetThrowExample();
    }

    static void orElse() {
        Optional<Person> person = PersonRepository.getPersonOptional();
        Optional<Person> person1 = Optional.of(new Person());

        String name = person1.map(Person::getName).orElse("NO RECORD FOUND");
        System.out.println("Or else example:" + name);
    }

    static void orElseGet() {

        Optional<Person> person = PersonRepository.getPersonOptional();
        String name = person.map(Person::getName).orElseGet(() -> {
            return "NO REC found..";
        });
        System.out.println("Or else GET::" + name);
    }

    static void orElseGetThrowExample() {
        Optional<Person> person = PersonRepository.getPersonOptional();
        String name = person.map(Person::getName).orElseThrow(() -> new RuntimeException("NO RECORD found.."));
        System.out.println("Or else Throw example::" + name);
    }
}
