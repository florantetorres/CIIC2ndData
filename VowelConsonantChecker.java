import java.util.Scanner;
public class VowelConsonantChecker {
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);
        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        // Initialize counters for vowels and consonants
        int vowelCount = 0;
        int consonantCount = 0;
        // Convert the input string to lowercase
        input = input.toLowerCase();
        // Iterate over each character in the input string
        for (char c : input.toCharArray()) {
            // Check if the character is a letter
            if (Character.isLetter(c)) {
                // Check if the character is a vowel
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowelCount++; // Increment the vowel count
                } else {
                    consonantCount++; // Increment the consonant count
                }
            }
        }
        // Print the results
        System.out.println("Vowel count: " + vowelCount);
        System.out.println("Consonant count: " + consonantCount);
        scanner.close(); // Close the scanner
    }
}