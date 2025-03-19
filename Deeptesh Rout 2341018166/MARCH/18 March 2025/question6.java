/*Write a memory-intensive Java program that creates a large number of objects and test 
it using the G1 garbage collector. Print timestamps along with the total heap size and 
free memory. Use the following commands to retrieve heap memory details: 
• Total heap memory: Runtime.getRuntime().totalMemory(); 
• Free heap memory: Runtime.getRuntime().freeMemory(); */

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class MemoryIntensiveApp {
    private int id;
    private double value;

    // Constructor
    public MemoryIntensiveApp(int id, double value) {
        this.id = id;
        this.value = value;
    }

    // Print formatted timestamp
    private static String getTimestamp() {
        return new SimpleDateFormat("HH:mm:ss.SSS").format(new Date());
    }

    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();

        System.out.println(getTimestamp() + " - Starting Memory Intensive Task");

        // Memory details before object creation
        long totalBefore = runtime.totalMemory();
        long freeBefore = runtime.freeMemory();
        System.out.println(getTimestamp() + " - Before Object Creation - Total Heap: " + totalBefore + ", Free Heap: " + freeBefore);

        // Creating a large number of objects
        List<MemoryIntensiveApp> list = new ArrayList<>();
        for (int i = 0; i < 10_000_000; i++) {
            list.add(new MemoryIntensiveApp(i, Math.random() * 100));
        }

        // Memory details after object creation
        long totalAfterCreation = runtime.totalMemory();
        long freeAfterCreation = runtime.freeMemory();
        System.out.println(getTimestamp() + " - After Object Creation - Total Heap: " + totalAfterCreation + ", Free Heap: " + freeAfterCreation);

        // Making objects eligible for garbage collection
        list = null;

        // Suggest garbage collection
        System.out.println(getTimestamp() + " - Requesting Garbage Collection...");
        System.gc();
        runtime.runFinalization();

        // Memory details after garbage collection
        long totalAfterGC = runtime.totalMemory();
        long freeAfterGC = runtime.freeMemory();
        System.out.println(getTimestamp() + " - After Garbage Collection - Total Heap: " + totalAfterGC + ", Free Heap: " + freeAfterGC);

        System.out.println(getTimestamp() + " - Program Completed.");
    }
}
