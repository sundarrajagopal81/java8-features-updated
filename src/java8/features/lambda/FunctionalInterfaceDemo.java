package src.java8.features.lambda;

public class FunctionalInterfaceDemo{
    public static void main(String[] args) {

    }
}
@FunctionalInterface
interface FunInterface{
    //abstrace method ..only one allowed here
    void add();

    default void methodOne(){
        System.out.println("Message from methodOne default method..These methods can be overridden..");
    }

    static void methodTwo(){
        System.out.println("Message from method2...method cannot be overridden ");
    }
}
