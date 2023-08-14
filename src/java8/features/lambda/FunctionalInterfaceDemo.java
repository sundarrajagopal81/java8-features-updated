package src.java8.features.lambda;

@FunctionalInterface
interface FunInterface {
    static void methodTwo() {
        System.out.println("Message from method2...method cannot be overridden ");
    }

    //abstrace method ..only one allowed here
    void add();

    default void methodOne() {
        System.out.println("Message from methodOne default method..These methods can be overridden..");
    }
}

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {

    }
}
