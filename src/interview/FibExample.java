package src.interview;

class FibExample {

    // Function to print the Fibonacci Series
    static void fib(int n) {

        int a = 0, b = 1, c, i;

        if (n <= 1)
            System.out.print(a + " ");
        else {

            System.out.print(a + " " + b + " ");

            for (i = 3; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;

                System.out.print(c + " ");
            }

            System.out.println();
        }
    }

    // Driver code
    public static void main(String[] args) {


        // Print the Fibonacci series
        fib(10);

    }
}