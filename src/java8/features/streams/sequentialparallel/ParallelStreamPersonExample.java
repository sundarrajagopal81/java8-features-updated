package src.java8.features.streams.sequentialparallel;

import src.java8.features.repo.Person;
import src.java8.features.repo.PersonRepository;

import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreamPersonExample {
    public static void main(String[] args) {
        getHobbiesBySeq();
        System.out.println("__________________");
        getHobbiesByParallel();
    }

    static List<String> getHobbiesBySeq() {
        long start = System.currentTimeMillis();
        List<String> hobbies = PersonRepository.getAllPersons().stream().map(Person::getHobbies).flatMap(List::stream).collect(Collectors.toList());
        long end = System.currentTimeMillis();
        System.out.println("seq Duration::" + (end - start));
        return hobbies;
    }


    static List<String> getHobbiesByParallel() {
        long start = System.currentTimeMillis();
        List<String> hobbies = PersonRepository.getAllPersons().stream().parallel().map(Person::getHobbies).flatMap(List::stream).collect(Collectors.toList());
        long end = System.currentTimeMillis();
        System.out.println("Parallel Duration::" + (end - start));
        return hobbies;
    }
}

