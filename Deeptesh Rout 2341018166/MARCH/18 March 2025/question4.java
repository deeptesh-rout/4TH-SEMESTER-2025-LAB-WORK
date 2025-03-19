/*Create a Java program to demonstrate anonymous objects and garbage collection using 
the AnonymousObject class. The class should have a constructor to initialize an object 
with a name. In the main() method, create an anonymous object and explicitly invoke 
the garbage collector. Override the finalize() method to print the object's name upon 
successful garbage collection. */

class AnonymousObject {
    private String name;

    // Constructor to initialize an object with a given name
    public AnonymousObject(String name) {
        this.name = name;
        System.out.println(name + " created.");
    }

    // Overriding finalize() method to demonstrate garbage collection
    @Override
    protected void finalize() throws Throwable {
        System.out.println(name + " is being garbage collected.");
    }

    public static void main(String[] args) {
        // Creating an anonymous object
        new AnonymousObject("TempObject");

        // Explicitly invoking garbage collector
        System.gc();

        // Suggest the JVM to run finalization
        Runtime.getRuntime().runFinalization();

        System.out.println("End of main method.");
    }
}
