package src.java8.features.methodreference;

import java.util.Comparator;

public class MethodReferenceExample {
    //Class name :: staticMethodName - () -> {}
    //Obj::methodName   new Object call
    //ClassName:new  -> Constructor call


    public static void main(String[] args) {
        System.out.println("Before Java  " + MethodReferenceExample.compareMethod(10, 20));
        Comparator<Integer> comp = MethodReferenceExample::compareMethod;  // Method Reference
        System.out.println("In Java8 :" + comp.compare(1, 2));
        Comparator<Integer> comp1 = (a, b) -> compareMethod(1, 2);
        System.out.println("In Java8->  :" + comp1.toString());

    }

    static int compareMethod(Integer x, Integer y) {
        return Integer.compare(x, y);

    }
}
