package src.java8.features.streams.terminaloperator;

import src.java8.features.repo.Person;
import src.java8.features.repo.PersonRepository;

import java.util.stream.Collectors;

public class StreamJoiningPersonExample {

    static String joinNames() {

        return PersonRepository.getAllPersons().stream().map(Person::getName).collect(Collectors.joining());
    }

    static String joinNamesWithSingleParam() {
        return PersonRepository.getAllPersons().stream().map(Person::getName).collect(Collectors.joining("-"));
    }

    static String joinWith3Params() {
        return PersonRepository.getAllPersons().stream().
                map(Person::getName).collect(Collectors.joining("-", "[", "]"));
    }

    public static void main(String[] args) {
        System.out.println("Names::" + joinNames());
        System.out.println("JoinNameWithSingle Param:::" + joinNamesWithSingleParam());
        System.out.println("Names with 3 params::" + joinWith3Params());
    }

}
