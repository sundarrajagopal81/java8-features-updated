package src.java8.features.functionalinterface.predicate;

import src.java8.features.repo.Person;
import src.java8.features.repo.PersonRepository;

import java.util.List;
import java.util.function.Predicate;

public class PredicatePersonExample {
    static Predicate<Person> heightPredicate = per -> per.getHeight() >= 140;
    static Predicate<Person> genderPredicate = per -> per.getGender().equals("Male");

    public static void main(String[] args) {
        List<Person> personList = PersonRepository.getAllPersons();
        personList.forEach(per -> {
            if (heightPredicate.and(genderPredicate).test(per)) {
                System.out.println(per);
            }
        });


    }
}
