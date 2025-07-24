package TwelveAssignment;

import java.util.Scanner;
public class stringb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string of at least 10 characters: ");
        String input = scanner.nextLine();
        scanner.close();
        if (input.length() < 10) {
            System.out.println("Please enter a string of at least 10 characters.");
            return;
        }
        StringBuilder sb = new StringBuilder(input);
        // 1. Print the length of the string
        System.out.println("Length of the string: " + sb.length());
        // 2. Print the first character of the string
        System.out.println("First character: " + sb.charAt(0));
        // 3. Print the last character of the string
        System.out.println("Last character: " + sb.charAt(sb.length() - 1));
        // 4. Print the index of the first occurrence of the letter 'a' in the string
        int index = sb.indexOf("a");
        System.out.println("Index of 'a': " + (index == -1 ? "Not found" : index));
        // 5. Print the substring of the string from index 3 to index 6
        System.out.println("Substring (3-6): " + sb.substring(3, 6));
        // 6. Append the string "123" to the end of the string
        sb.append("123");
        System.out.println("After appending '123': " + sb);
        // 7. Insert the string "xyz" at index 4
        sb.insert(4, "xyz");
        System.out.println("After inserting 'xyz' at index 4: " + sb);
        // 8. Delete the substring from index 2 to index 5 (considering the inserted string)
        sb.delete(2, 5);
        System.out.println("After deleting substring from index 2 to 5: " + sb);
        // 9. Delete the character at index 8
        if (sb.length() > 8) {
            sb.deleteCharAt(8);
            System.out.println("After deleting character at index 8: " + sb);
        } else {
            System.out.println("Index out of range for deleteCharAt(8)");
        }
        // 10. Reverse the string and print it
        sb.reverse();
        System.out.println("Reversed string: " + sb);
    }
}