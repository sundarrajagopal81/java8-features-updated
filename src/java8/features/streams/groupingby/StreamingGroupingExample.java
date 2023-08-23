package src.java8.features.streams.groupingby;

import src.java8.features.repo.Person;
import src.java8.features.repo.PersonRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamingGroupingExample {
    public static void main(String[] args) {
        groupByGender();
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        groupByHeight();
        System.out.println("%%%%%%%%%%%%%%%%%");
        twoLevelGrouping();
        System.out.println("$$$$$$$$$$$$$$$$$");
        twoLevelGroupingCount();
        System.out.println("^^^^^^^^^^^^^^^^^^^");
        threeLevelGrouping();
    }

    static void groupByGender() {
        Map<String, List<Person>> groupData = PersonRepository.getAllPersons().stream().collect(
                Collectors.groupingBy(Person::getGender));
        Stream.of(groupData).forEach(System.out::println);
    }

    static void groupByHeight() {
        Map<String, List<Person>> groupData = PersonRepository.getAllPersons().stream().collect(
                Collectors.groupingBy(per -> per.getHeight() > 140 ? "Talest" : "Shortest"));
        Stream.of(groupData).forEach(System.out::print);
    }

    static void twoLevelGrouping() {
        Map<String, Map<String, List<Person>>> mapData = PersonRepository.getAllPersons().stream().collect(Collectors.groupingBy(Person::getGender,
                Collectors.groupingBy(per -> per.getHeight() > 140 ? "Talest" : "Shortest")));
        Stream.of(mapData).forEach(System.out::println);
    }

    static void twoLevelGroupingCount() {
        Map<String, Integer> mapData = PersonRepository.getAllPersons().stream().collect(Collectors.groupingBy(Person::getGender, Collectors.summingInt(Person::getKids)));
        Stream.of(mapData).forEach(System.out::println);
    }

    static void threeLevelGrouping() {
        Map<String, List<Person>> mapData = PersonRepository.getAllPersons().stream().collect(Collectors.groupingBy(Person::getGender, HashMap::new, Collectors.toList()));
        Stream.of(mapData).forEach(System.out::println);
    }
}
