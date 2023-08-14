package src.java8.features.lambda;

public class RunnableLambdaExample {

    public static void main(String[] args) {

        //BEFORE JAVA 8
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread-1");
            }
        };
        new Thread(runnable).start();
        //AFTER JAVA8
        //() -> ()
        Runnable runnable1 = () -> System.out.println("Thread-2");
        new Thread(runnable1).start();

        // Thread example BEFORE Java8

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread-3");
            }
        }).start();
        //AFTER java8

        new Thread(() ->
        {
            System.out.println("Thread-4");
            System.out.println("Thread-5");
        }).start();
    }
}
