/*Write a Java program to demonstrate nullification of references and garbage collection 
using the NullifiedReference class. The class should have a constructor to initialize an 
object with a given name. In the main() method, create an instance of 
NullifiedReference, assign it, then nullify the reference, and explicitly invoke the 
garbage collector. Override the finalize() method to print the object's name upon 
successful garbage collection. */

class NullifiedReference {
    private String name;

    // Constructor to initialize an object with a given name
    public NullifiedReference(String name) {
        this.name = name;
        System.out.println(name + " created.");
    }

    // Overriding finalize() method to demonstrate garbage collection
    @Override
    protected void finalize() throws Throwable {
        System.out.println(name + " is being garbage collected.");
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // Creating an instance of NullifiedReference
        NullifiedReference obj = new NullifiedReference("TestObject");

        // Nullifying the reference, making the object eligible for garbage collection
        obj = null;

        // Explicitly invoking garbage collector
        System.gc();

        // Suggest the JVM to run finalization
        Runtime.getRuntime().runFinalization();

        System.out.println("End of main method.");
    }
}
