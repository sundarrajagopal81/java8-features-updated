package src.java8.features.streams.optional;

import src.java8.features.repo.Address;
import src.java8.features.repo.Person;
import src.java8.features.repo.PersonRepository;

import java.util.Optional;

public class OptionalMapPersonExample {
    public static void main(String[] args) {

        Optional<String> ofNullable = Optional.ofNullable("sundar rajagopal");
        System.out.println(ofNullable.isPresent() ? ofNullable.get() : Optional.empty());
        ofNullable.ifPresent(System.out::println);
        System.out.println("$$$$$$$$$$$$$$$$$$");
        optionalMapExample();
        System.out.println("****************");
        optionalFlatMap();
        System.out.println("######################");
        optionalFilterExample();

    }

    static void optionalMapExample() {

        Optional<Person> person = PersonRepository.getPersonOptional();
        person.ifPresent(per -> {
            String name = person.map(Person::getName).orElse("No Record found...");
            System.out.println("Name::" + name);
        });
    }

    static void optionalFlatMap() {
        Optional<Person> person1 = PersonRepository.getPersonOptional();
        if (person1.isPresent()) {
            Optional<Address> address = person1.flatMap(Person::getAddress);
            System.out.println(address);
        }
    }

    static void optionalFilterExample() {
        Optional<Person> person = PersonRepository.getPersonOptional().filter(per -> per.getHeight() >= 140);
        person.ifPresent(per -> System.out.println(per.getAddress().get()));
    }
}
