class UnreachableObject {
    private String name;

    // Constructor to initialize an object with a given name
    public UnreachableObject(String name) {
        this.name = name;
        System.out.println(name + " created.");
    }

    // Method to create an instance and invoke display()
    public void show() {
        UnreachableObject obj1 = new UnreachableObject("Object1");
        obj1.display();
    }

    // Method to create another instance
    @SuppressWarnings("unused")
    public void display() {
        UnreachableObject obj2 = new UnreachableObject("Object2");
    }

    // Overriding finalize() method to demonstrate garbage collection
    @Override
    protected void finalize() throws Throwable {
        System.out.println(name + " is being garbage collected.");
    }

    public static void main(String[] args) {
        UnreachableObject obj = new UnreachableObject("MainObject");
        obj.show();

        // Explicitly invoking garbage collector
        obj = null; // Making object eligible for garbage collection
        System.gc();

        // Suggest the JVM to run finalization
        Runtime.getRuntime().runFinalization();

        System.out.println("End of main method.");
    }
}
