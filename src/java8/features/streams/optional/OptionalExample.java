package src.java8.features.streams.optional;

import src.java8.features.repo.Person;
import src.java8.features.repo.PersonRepository;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> name = Optional.ofNullable(null);
        // System.out.println("Name::"+name.get());
        System.out.println(name.isPresent() ? name.get() : "No RECORD found");
        // System.out.println(personName(new Person()));
        System.out.println(personNameOptional(PersonRepository.getPersonOptional()).get());
    }

    static String myName(String name) {
        return name;
    }

    static Optional<String> personNameOptional(Optional<Person> person) {
        if (person.isPresent()) {
            //return Optional.of (person.get().getName()); // Both approach will work
            return person.map(Person::getName); // both the approach will work
        } else {
            return Optional.empty();
        }
    }

    static String personName(String name) {
        if (null != name) {
            return name;
        } else {
            return "No Record Found";
        }
    }
}
