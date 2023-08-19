package src.java8.features.miscellaneous;

import java.util.function.Consumer;

public class LambdaVariableScope {
    static int k = 30;

    public static void main(String[] args) {
        int i = 20;
        Consumer<Integer> c1 = j -> {
            System.out.println("Value J " + j);
            System.out.println(("Value I " + i));
            System.out.println("Value K " + k);
            k = 60;
            System.out.println("Value updated K " + k);
            // i++;//local variables referenced from a lambda expression must be final or effectively final
        };
        c1.accept(10);
    }
}
