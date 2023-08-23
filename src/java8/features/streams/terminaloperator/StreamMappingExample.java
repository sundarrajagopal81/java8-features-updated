package src.java8.features.streams.terminaloperator;

import src.java8.features.repo.Person;
import src.java8.features.repo.PersonRepository;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamMappingExample {

    static List<String> mappingNames() {
        //return PersonRepository.getAllPersons().stream().map(Person::getName).collect(Collectors.toList()); //Normal way
        return PersonRepository.getAllPersons().stream().collect(Collectors.mapping(Person::getName, Collectors.toList()));
        //this will increase the performance
    }

    static Set<String> mappingNamesWithSet() {
        return PersonRepository.getAllPersons().stream().collect(Collectors.mapping(Person::getName, Collectors.toSet()));
    }

    public static long countTallestPerson() {
        return PersonRepository.getAllPersons().stream().filter(per -> per.getHeight() >= 140 && per.getGender().equals("Male")).collect(Collectors.counting());
    }

    public static void main(String[] args) {
        System.out.println("Mappingnames::" + mappingNames());
        System.out.println("MappingNamewithSet::" + mappingNamesWithSet());
        System.out.println("CountOftallest Person::" + countTallestPerson());
    }


}
