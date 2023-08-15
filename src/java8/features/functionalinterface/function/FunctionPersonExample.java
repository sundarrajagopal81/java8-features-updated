package src.java8.features.functionalinterface.function;

import src.java8.features.repo.Person;
import src.java8.features.repo.PersonRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionPersonExample {
    static Predicate<Person> heightPredicate = per -> per.getHeight() >= 140;
    static Predicate<Person> genderPredicate = per -> per.getGender().equals("Male");
    static Function<List<Person>, Map<String, Double>> personDetails = (personList) -> {
        Map<String, Double> map = new HashMap<>();
        personList.forEach(per -> {
            if (heightPredicate.and(genderPredicate).test(per)) {
                map.put(per.getName(), per.getSalary());
            }
        });
        return map;
    };

    public static void main(String[] args) {
        List<Person> personList = PersonRepository.getAllPersons();
        System.out.println(personDetails.apply(personList));
    }

}