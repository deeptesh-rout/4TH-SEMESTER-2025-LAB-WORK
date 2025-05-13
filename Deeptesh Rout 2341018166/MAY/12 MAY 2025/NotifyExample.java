// Question 1

class SharedResource {
    private boolean available = false;

    public synchronized void produce() throws InterruptedException {
        while (available) {
            wait(); // Wait until the resource is consumed
        }
        System.out.println("Produced an item");
        available = true;
        notify(); // Notify a single waiting thread (consumer)
        // notifyAll(); // Optionally, notify all waiting threads
    }

    public synchronized void consume() throws InterruptedException {
        while (!available) {
            wait(); // Wait until the resource is produced
        }
        System.out.println("Consumed an item");
        available = false;
        notify(); // Notify a single waiting thread (producer)
        // notifyAll(); // Optionally, notify all waiting threads
    }
}

public class NotifyExample {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread producer = new Thread(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    resource.produce();
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    resource.consume();
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        producer.start();
        consumer.start();
    }
}
