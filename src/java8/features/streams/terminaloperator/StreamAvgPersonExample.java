package src.java8.features.streams.terminaloperator;

import src.java8.features.repo.Person;
import src.java8.features.repo.PersonRepository;

import java.util.stream.Collectors;

public class StreamAvgPersonExample {

    static double averageHeight() {
        return PersonRepository.getAllPersons().stream().collect(Collectors.averagingInt(Person::getHeight));
    }

    static int sumOfKids() {
        return PersonRepository.getAllPersons().stream().filter(per -> per.getGender().equals("Male")).collect(Collectors.summingInt(Person::getKids));
    }

    public static void main(String[] args) {
        System.out.println("AVG::" + averageHeight());
        System.out.println("SUM of kids::" + sumOfKids());
    }
}
