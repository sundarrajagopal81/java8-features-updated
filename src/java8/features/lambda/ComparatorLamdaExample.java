package src.java8.features.lambda;

import java.util.Comparator;

public class ComparatorLamdaExample {
    public static void main(String[] args) {
        //BEFORE JAVA 8
        Comparator<Integer> c1 = new Comparator<>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        System.out.println("Before Java8::" + c1.compare(20, 10));
        //AFTER JAVA8
        Comparator<Integer> c2 = (Integer x1, Integer x2) -> x2.compareTo(x2);
        System.out.println("After Java8:" + c2.compare(10, 20));
    }
}
