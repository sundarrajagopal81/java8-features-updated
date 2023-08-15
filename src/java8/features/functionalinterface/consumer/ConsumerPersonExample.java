package src.java8.features.functionalinterface.consumer;

import src.java8.features.repo.Person;
import src.java8.features.repo.PersonRepository;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerPersonExample {

    static Consumer<Person> c1 = (per) -> System.out.println(per);
    static Consumer<Person> c2 = (per) -> System.out.println(per.getName().toUpperCase());
    static List<Person> personlist = PersonRepository.getAllPersons();

    public static void main(String[] args) {
        // personlist.forEach(c1);
        personlist.forEach(c1.andThen(c2));
        printWithCondition();
    }

    static void printWithCondition() {
        personlist.forEach((per -> {
            if (per.getGender().equals("Male") && per.getHeight() >= 140) {
                c1.andThen(c2).accept(per);
            }
        }));


    }

}
