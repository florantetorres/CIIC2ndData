package TwelveAssignment;

import java.util.Scanner;
public class CountWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a paragraph: ");
        String input = scanner.nextLine();
        scanner.close();
        // Split the input into words
        String[] words = input.split("\\s+");
        // Count the number of words
        int wordCount = words.length;
        // Determine if the word count is odd or even
        String parity = (wordCount % 2 == 0) ? "Even" : "Odd";
        System.out.println("Total words: " + wordCount);
        System.out.println("Word count is " + parity);
    }
}