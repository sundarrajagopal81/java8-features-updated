package src.java8.features.streams.optional;

import java.util.Optional;

public class OptionalMethodsExample {
    public static void main(String[] args) {
        Optional<String> ofNullable = Optional.ofNullable("Java 8");
        System.out.println(ofNullable.isPresent() ? ofNullable.get() : Optional.empty());

        Optional<String> of = Optional.of("JAVA 8");
        System.out.println(of.isPresent() ? of.get() : Optional.empty());

        Optional<String> of1 = Optional.of(null);
        System.out.println(of1.isPresent() ? of1.get() : Optional.empty());

        System.out.println(Optional.empty());
    }

}
