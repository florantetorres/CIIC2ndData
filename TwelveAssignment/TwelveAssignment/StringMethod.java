package TwelveAssignment;
import java.util.Scanner;
public class StringMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();
        // Find and print the length of the string
        System.out.println("Length of the string: " + input.length());
        // Convert the string to uppercase and print it
        System.out.println("String in uppercase: " + input.toUpperCase());
        // Convert the string to lowercase and print it
        System.out.println("String in lowercase: " + input.toLowerCase());
        // Print the first character of the string
        if (input.length() > 0) {
            System.out.println("First character: " + input.charAt(0));
        } else {
            System.out.println("String is empty.");
        }
        // Print the last character of the string
        if (input.length() > 0) {
            System.out.println("Last character: " + input.charAt(input.length() - 1));
        } else {
            System.out.println("String is empty.");
        }
        // Print the substring starting from the second character to the fifth character of the string
        if (input.length() >= 5) {
            System.out.println("Substring (2nd to 5th character): " + input.substring(1, 5));
        } else if (input.length() > 1) {
            System.out.println("Substring (2nd character to end): " + input.substring(1));
        } else {
            System.out.println("String is too short for substring operation.");
        }
    }
}
