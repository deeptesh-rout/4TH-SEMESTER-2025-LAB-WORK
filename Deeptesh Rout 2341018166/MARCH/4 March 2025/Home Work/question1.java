
/*Q1. WAP in java to use Comparable interface to sort the names based on the length of the input String
Note a. Create a List with 4 Names with different size.
b. Print the List to show the input names.
c. Implement the compareTo() to sort the names based on their size.
d. Print the sorted List.
 */

import java.util.*;

class NameSorter implements Comparable<NameSorter> {
    String name;

    public NameSorter(String name) {
        this.name = name;
    }

    // Implement compareTo to sort based on length of the name
    @Override
    public int compareTo(NameSorter other) {
        return Integer.compare(this.name.length(), other.name.length());
    }

    @Override
    public String toString() {
        return name;
    }
}

public class question1 {
    public static void main(String[] args) {
        // Creating a list with 4 names of different lengths
        List<NameSorter> names = new ArrayList<>();
        names.add(new NameSorter("Alice"));
        names.add(new NameSorter("Bob"));
        names.add(new NameSorter("Jonathan"));
        names.add(new NameSorter("Eve"));

        // Printing the original list
        System.out.println("Original List:");
        for (NameSorter name : names) {
            System.out.println(name);
        }

        // Sorting the list based on name length
        Collections.sort(names);

        // Printing the sorted list
        System.out.println("\nSorted List (by length):");
        for (NameSorter name : names) {
            System.out.println(name);
        }
    }
}
