import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine().trim().toLowerCase();
        StringBuilder sb = new StringBuilder(input);
        String reverse = sb.reverse().toString();
        if (input.equals(reverse)) {
            System.out.println("The input string is a palindrome.");
        } else {
            System.out.println("The input string is not a palindrome.");
        }
        scanner.close();
    }
}