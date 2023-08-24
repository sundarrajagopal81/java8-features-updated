package src.java8.features.streams.sequentialparallel;

import java.util.stream.IntStream;

public class ParallelWhenNotToUse1 {
    public static void main(String[] args) {

        Calculation cal = new Calculation();

        IntStream.rangeClosed(1, 12345).forEach(cal::calculate);
        System.out.println("seq SUM::" + cal.getTotal());
        IntStream.rangeClosed(1, 12345).parallel().forEach(cal::calculate);
        System.out.println("para SUM:" + cal.getTotal());

    }
}

class Calculation {
    private int total;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void calculate(int n) {
        total += n;
    }
}
