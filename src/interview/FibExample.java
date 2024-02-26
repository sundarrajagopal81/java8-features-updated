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

    static void fib1(int n) {
        int a = 0, b = 1, c, i;


        if (n <= 1) {
            System.out.println(a + " ");
        } else {
            System.out.println(a + " " + b + " ");
            for (int j = 3; j <= n; j++) {

                c = a + b;
                a = b;
                b = c;
                System.out.println(c + " ");

            }
            System.out.println();

        }
    }
    // Driver code
    public static void main(String[] args) {


        // Print the Fibonacci series
       // fib(10);
            fib1(12);

    }
}