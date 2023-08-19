package src.java8.features.streams;

import src.java8.features.repo.Person;
import src.java8.features.repo.PersonRepository;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExample1 {
    static Predicate<Person> height = per -> per.getHeight() >= 140;
    static Predicate<Person> gender = per -> per.getGender().equals("Male");

    public static void main(String[] args) {
        Map<String, List<String>> map = PersonRepository.getAllPersons().
                stream().filter(height.and(gender)).collect(Collectors.toMap(
                        Person::getName, Person::getHobbies));
        System.out.println("Person Map::" + map);


        List<String> personHobbies = PersonRepository.getAllPersons()//List of person
                .stream()
                .map(Person::getHobbies)//Stream List of <string>
                .flatMap(List::stream) //Stream<String>
                .distinct().collect(Collectors.toList());
        System.out.println("####");
        System.out.println(personHobbies);
    }
}
