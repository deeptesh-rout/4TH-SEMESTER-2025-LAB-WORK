import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class RunnableExample1 implements Runnable {
    private long counter;

    // Constructor to initialize the counter
    public RunnableExample1(long counter) {
        this.counter = counter;
    }

    public static void main(String[] args) {
        Executor executor = Executors.newSingleThreadExecutor();
        executor.execute(new RunnableExample1(1000));
    }

    @Override
    public void run() {
        long total = 0;
        for (long i = 1; i < counter; i++) {
            total += i;
        }

        System.out.println("Sum from 1 to " + (counter - 1) + " is: " + total);
    }
}
