package src.java8.features.functionalinterface.consumer;

import src.java8.features.repo.Person;
import src.java8.features.repo.PersonRepository;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerPersonExample {

    static List<Person> personList = PersonRepository.getAllPersons();
    static BiConsumer<String, List<String>> hobbies = (name, hobbies) ->
            System.out.println("Name :" + name + " /hobbies : " + hobbies);

    static BiConsumer<String, Double> income = (name, salary) -> System.out.println("Name: " + name + " /Salary: " + salary);

    public static void main(String[] args) {

        fetchHobbies();
        System.out.println("=====================");
        fetchIncome();
    }

    static void fetchHobbies() {
        personList.forEach(per -> {
            hobbies.accept(per.getName(), per.getHobbies());
            //Same place we can call the income also
            income.accept(per.getName(), per.getSalary());
        });
    }

    static void fetchIncome() {
        personList.forEach(per -> {
            income.accept(per.getName(), per.getSalary());
        });
    }
}
