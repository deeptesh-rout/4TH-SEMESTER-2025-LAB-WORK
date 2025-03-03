import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class User {
    private String name;
    private int age;

    // Parameterized constructor
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }
}

public class question7 {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();

        // Adding User objects to the ArrayList
        users.add(new User("Alice", 25));
        users.add(new User("Bob", 30));
        users.add(new User("Charlie", 22));

        // Printing user details before sorting
        System.out.println("Users before sorting:");
        for (User user : users) {
            System.out.println(user.getName() + " - " + user.getAge());
        }

        // Sorting users based on age
        Collections.sort(users, Comparator.comparingInt(User::getAge));

        // Printing user details after sorting
        System.out.println("\nUsers after sorting by age:");
        for (User user : users) {
            System.out.println(user.getName() + " - " + user.getAge());
        }
    }
}