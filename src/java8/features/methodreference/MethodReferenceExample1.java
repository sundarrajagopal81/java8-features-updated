package src.java8.features.methodreference;

import src.java8.features.repo.Person;
import src.java8.features.repo.PersonRepository;

import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceExample1 {

    static Predicate<Person> p1 = MethodReferenceExample1::heightCheck; // per -> heightCheck
    static BiPredicate<Person, Integer> p2 = MethodReferenceExample1::heightCheckWithParam;

    static boolean heightCheck(Person per) {
        return per.getHeight() >= 140;
    }

    static boolean heightCheckWithParam(Person per, Integer height) {
        return per.getHeight() >= height;
    }

    public static void main(String[] args) {

        System.out.println("Predicate Height::" + p1.test(PersonRepository.getPerson()));
        System.out.println("Predicate Height with Param::" + p2.test(PersonRepository.getPerson(), 160));
        MethodReferenceExample1 obj1 = new MethodReferenceExample1();
        Function<String, String> f1 = obj1::sayMyName;
        System.out.println("Say My Name::" + f1.apply("Sundar"));

    }

    String sayMyName(String name) {
        return "Hello " + name;
    }
}
