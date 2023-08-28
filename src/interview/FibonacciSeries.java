package src.interview;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Fn = Fn-1 + Fn-2
 */
public class FibonacciSeries {

    static Map<Long, BigInteger> fibMap = new HashMap<>();

    static {
        fibMap.put(1L, BigInteger.ZERO);
        fibMap.put(2L, BigInteger.ONE);
    }

    public static void fib(int n) {
        int number1 = 0;
        int number2 = 1;
        int counter = 0;
        while (counter < n) {
            System.out.println(number1 + " ");
            int number3 = number2 + number1;
            number1 = number2;
            number2 = number3;
            counter++;
        }
    }

    //Recurrsive...
    public static int getFib(int num) {
        if (num == 1) {
            return 0;
        }
        if (num == 2) {
            return 1;
        }
        return getFib(num - 1) + getFib(num - 2);
    }

    public static BigInteger fibSeries(long n) {

        if (n < 3) {
            return fibMap.get(n);
        }
        if (fibMap.containsKey(n)) {
            return fibMap.get(n);
        }

        fibMap.put(n, fibSeries(n - 1).add(fibSeries(n - 2)));
        return fibMap.get(n);
    }

    public static void main(String[] args) {

        //FIB series reurrsive..
        //  System.out.println(getFib(60));

        System.out.println(fibSeries(10));

        //fib(20);


        //TODO
        // Fibonacci Series using Java 8..
        String fibNumbers = Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
                .limit(20).map(t -> t[0]).map(String::valueOf).collect(Collectors.joining(","));
        //System.out.println(fibNumbers);
    }
}
