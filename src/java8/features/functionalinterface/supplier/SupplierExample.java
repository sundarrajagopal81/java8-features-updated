package src.java8.features.functionalinterface.supplier;

import src.java8.features.repo.Person;
import src.java8.features.repo.PersonRepository;

import java.util.List;
import java.util.function.Supplier;

/**
 * Represents a supplier of results.
 * There is no requirement that a new or distinct result be returned each time the supplier is invoked.
 * <p>
 * This is a functional interface whose functional method is get().
 * <p>
 * T get()
 * Gets a result.
 * Returns:
 * a result
 */
public class SupplierExample {

    static Supplier<List<Person>> supplier1 = () -> PersonRepository.getAllPersons();
    static Supplier<Person> supplier2 = () -> PersonRepository.getPerson();
    static Supplier<Double> supplier3 = () -> Math.random();

    public static void main(String[] args) {
        System.out.println(supplier1.get());
        System.out.println(supplier2.get());
        System.out.println(supplier3.get());
    }
}
