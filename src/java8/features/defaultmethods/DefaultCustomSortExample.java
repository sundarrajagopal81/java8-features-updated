package src.java8.features.defaultmethods;

import src.java8.features.repo.Person;
import src.java8.features.repo.PersonRepository;

import java.util.Comparator;
import java.util.List;

public class DefaultCustomSortExample {

    static Comparator<Person> c2 = Comparator.comparing(Person::getHeight);
    static Comparator<Person> c1 = Comparator.comparing(Person::getName);

    public static void main(String[] args) {

        List<Person> lists = PersonRepository.getAllPersons();
        sortByName(lists);
        System.out.println("_______________Sort by height");
        sortByHeight(lists);

        System.out.println("$$$$$$$$$$");
        sortNameAndHeight(lists);
    }

    static void sortByName(List<Person> personList) {
        personList.sort(c1);
        personList.forEach(System.out::println);
    }

    static void sortByHeight(List<Person> personList) {
        personList.sort(c2);
        personList.forEach(System.out::println);
    }

    static void sortNameAndHeight(List<Person> personList) {
        personList.sort(c1.thenComparing(c2));
        personList.forEach(System.out::println);
    }
}
