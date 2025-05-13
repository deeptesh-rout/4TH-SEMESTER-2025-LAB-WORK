public class DeadlockGeneralSolutionExample {
    private final Object lock1 = new Object();
    private final Object lock2 = new Object();

    public void method1() {
        synchronized (lock1) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {}

            synchronized (lock2) {
                System.out.println("Method 1");
            }
        }
    }

    public void method2() {
        synchronized (lock1) { // ✅ Same order of locking: lock1 → lock2
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {}

            synchronized (lock2) {
                System.out.println("Method 2");
            }
        }
    }

    public static void main(String[] args) {
        DeadlockGeneralSolutionExample example = new DeadlockGeneralSolutionExample();

        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                example.method1();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                example.method2();
            }
        });

        thread1.start();
        thread2.start();
    }
}
