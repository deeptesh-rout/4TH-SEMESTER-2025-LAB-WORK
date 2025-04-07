//PROGRAM 15

import java.util.*;

public class CatamorphismExample {
    // Function to calculate the sum of elements in a list
    static int sum(List<Integer> list) {
        int result = 0;
        for (int element : list) {
            result += element;
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // Calculate the sum of elements in the list
        int total = sum(numbers);
        System.out.println("Sum of elements: " + total);
    }
}
