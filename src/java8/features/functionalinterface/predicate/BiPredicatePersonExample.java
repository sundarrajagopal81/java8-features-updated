package src.java8.features.functionalinterface.predicate;

import src.java8.features.repo.Person;
import src.java8.features.repo.PersonRepository;

import java.util.List;
import java.util.function.BiPredicate;

public class BiPredicatePersonExample {

    static BiPredicate<Integer, String> heightAndGender = (height, gender) -> height >= 140 && gender.equals("Male");

    public static void main(String[] args) {
        List<Person> personList = PersonRepository.getAllPersons();
        personList.forEach(per -> {
            if (heightAndGender.test(per.getHeight(), per.getGender())) {
                System.out.println(per);
            }
        });

    }
}
