package src.java8.features.functionalinterface.function;

import src.java8.features.repo.Person;
import src.java8.features.repo.PersonRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

/**
 * Represents a function that accepts two arguments and produces a result. This is the two-arity specialization of Function.
 * This is a functional interface whose functional method is apply(Object, Object).
 * <p>
 * R apply(T t,
 * U u)
 * Applies this function to the given arguments.
 * Parameters:
 * t - the first function argument
 * u - the second function argument
 * Returns:
 * the function result
 */
public class BiFunctionPersonExample {

    static BiFunction<String, String, String> bf1 = (a, b) -> a.concat(b);

    static Predicate<Person> heightPredicate = per -> per.getHeight() >= 160;
    static Predicate<Person> genderPredicate = per -> per.getGender().equals("Male");

    static BiFunction<List<Person>, Predicate<Person>, Map<String, Double>> personDetails = (list, predicate) -> {
        Map<String, Double> map = new HashMap<>();
        list.forEach(per -> {
            if (predicate.test(per)) {
                map.put(per.getName(), per.getSalary());
            }
        });
        return map;
    };

    public static void main(String[] args) {
        System.out.println(bf1.apply("Sundar", "Rajagopal"));
        System.out.println(personDetails.apply(PersonRepository.getAllPersons(), genderPredicate)); // 2nd param is the predicate operator
        System.out.println(personDetails.apply(PersonRepository.getAllPersons(), genderPredicate.and(heightPredicate))); // can use the multiple predicates using the AND.
    }
}
