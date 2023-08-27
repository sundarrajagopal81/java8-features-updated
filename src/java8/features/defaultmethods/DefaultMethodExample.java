package src.java8.features.defaultmethods;

import src.java8.features.repo.Person;
import src.java8.features.repo.PersonRepository;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DefaultMethodExample {


    public static void main(String[] args) {
        List<String> nameList = PersonRepository.getAllPersons().stream().map(Person::getName).collect(Collectors.toList());

        System.out.println("Before sort..");
        System.out.println(nameList);
        Collections.sort(nameList);
        System.out.println("After sort...");
        System.out.println(nameList);
        System.out.println("after natural order");
        nameList.sort(Comparator.naturalOrder());
        System.out.println(nameList);
        System.out.println("reverse order");
        nameList.sort(Comparator.reverseOrder());
        System.out.println(nameList);
    }
}
