package src.java8.features.functionalinterface;

import src.java8.features.repo.Person;
import src.java8.features.repo.PersonRepository;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerPredicatePersonExample {

    static Predicate<Person> heightPredicate = per -> per.getHeight() >= 140;
    static Predicate<Person> genderPredicate = per -> per.getGender().equals("Male");
    static BiPredicate<Integer, String> heightAndGender = (height, gender) -> height >= 140 &&
            gender.equals("Male");

    static BiConsumer<String, List<String>> hobbies = (name, hobbies) -> System.out.println("Name::" + name + "/ hobbies: " + hobbies);

    static Consumer<Person> personConsumer = (per) -> {
        // if(heightPredicate.and(genderPredicate).test(per)){ // TODO this will work as well
        if (heightAndGender.test(per.getHeight(), per.getGender())) { // TODO this is combined one we will be fine.
            hobbies.accept(per.getName(), per.getHobbies());
        }
    };


    public static void main(String[] args) {
        List<Person> personList = PersonRepository.getAllPersons();
        personList.forEach(personConsumer);
    }
}
