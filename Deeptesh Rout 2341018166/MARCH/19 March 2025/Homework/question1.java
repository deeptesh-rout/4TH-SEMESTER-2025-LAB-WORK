

/*Question 1: Counting Word Occurrences in a Sentence
Write a Java program that takes a sentence and a word as input from the user. The program should count
and display the number of times the given word appears in the sentence. Use indexOf() and substring
operations to find occurrences of the word. Additionally, display the original sentence and the final
count.
 */

import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        System.out.print("Enter the word to search: ");
        String word = scanner.next();

        int count = 0;
        int index = sentence.indexOf(word);

        // Finding occurrences using indexOf and substring
        while (index != -1) {
            count++;
            index = sentence.indexOf(word, index + word.length());
        }

        // Displaying results
        System.out.println("Original Sentence: " + sentence);
        System.out.println("The word \"" + word + "\" appears " + count + " times in the sentence.");

        scanner.close();
    }
}
