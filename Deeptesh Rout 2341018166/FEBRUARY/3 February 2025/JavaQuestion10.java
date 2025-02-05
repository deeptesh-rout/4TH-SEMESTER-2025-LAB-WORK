Q10: Overriding hashCode() method
Program:
public class Main {
    private String name;
    private int age;
    public Main(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public int hashCode() {
        return age + name.length();
    }
    public static void main(String[] args) {
        Main person1 = new Main("John", 25);
        Main person2 = new Main("Hello", 30);
        System.out.println("HashCode of person1: " + person1.hashCode());
        System.out.println("HashCode of person2: " + person2.hashCode());
    }
}
/*
Output: 
HashCode of person1: 29
HashCode of person2: 35

Discussion:
* In the given Java program, the hashCode() method from the Object class is overridden in the Main class. 
* The default implementation of hashCode() in Object provides a unique identifier for each object. 
* However, in this case, we override it to return a custom hash code based on the age and the length of the name attribute.
* This method computes the hash code by adding the age value to the length of the name string. 
* The @Override annotation ensures that we are correctly overriding the hashCode() method from Object.
    */
