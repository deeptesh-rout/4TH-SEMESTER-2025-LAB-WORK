/*Develop a Java program to demonstrate reference reassignment and garbage collection 
using the ReassigningReference class. The class should have a constructor to initialize 
an object with a given name. In the main() method, create two instances of 
ReassigningReference, reassign one reference to another, and then explicitly invoke 
the garbage collector. Override the finalize() method to print the object's name upon 
successful garbage collection.  */

class ReassigningReference {
    private String name;

    // Constructor to initialize an object with a given name
    public ReassigningReference(String name) {
        this.name = name;
        System.out.println(name + " created.");
    }

    // Overriding finalize() method to demonstrate garbage collection
    @Override
    protected void finalize() throws Throwable {
        System.out.println(name + " is being garbage collected.");
    }

    public static void main(String[] args) {
        // Creating two instances
        @SuppressWarnings("unused")
        ReassigningReference obj1 = new ReassigningReference("Object1");
        ReassigningReference obj2 = new ReassigningReference("Object2");

        // Reassigning obj1 to obj2, making the first Object1 eligible for garbage collection
        obj1 = obj2;

        // Explicitly invoking garbage collector
        System.gc();

        // Suggest the JVM to run finalization (alternative to sleep)
        Runtime.getRuntime().runFinalization();

        System.out.println("End of main method.");
    }
}
