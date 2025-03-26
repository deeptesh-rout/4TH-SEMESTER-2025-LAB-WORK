import java.util.Scanner;

public class javaQuestion4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get sentence input from user
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Get search and replacement words
        System.out.print("Enter the word to search for: ");
        String searchWord = scanner.next();
        System.out.print("Enter the replacement word: ");
        String replaceWord = scanner.next();

        // Find the first occurrence of the search word
        int index = sentence.indexOf(searchWord);

        // Display original sentence
        System.out.println("\nOriginal Sentence: " + sentence);

        if (index != -1) {
            // Construct new sentence using substring and concatenation
            String modifiedSentence = sentence.substring(0, index) + replaceWord +
                                      sentence.substring(index + searchWord.length());

            // Display modified sentence
            System.out.println("Modified Sentence: " + modifiedSentence);
        } else {
            System.out.println("Word not found in the sentence.");
        }

        scanner.close();
    }
}
