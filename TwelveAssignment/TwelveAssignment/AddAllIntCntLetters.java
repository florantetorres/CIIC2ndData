package TwelveAssignment;
import java.util.Scanner;
public class AddAllIntCntLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input (numbers or string): ");
        String input = scanner.nextLine();
        scanner.close();
        try {
            // Attempt to parse input as integer
            int number = Integer.parseInt(input);
            System.out.println("Input is an integer.");
            System.out.println("Sum: " + number);
        } catch (NumberFormatException e) {
            // If parsing fails, count letters in the string
            System.out.println("Input is a string.");
            System.out.println("Letter count: " + countLetters(input));
        }
    }
    public static int countLetters(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                count++;
            }
        }
        return count;
    }
}
