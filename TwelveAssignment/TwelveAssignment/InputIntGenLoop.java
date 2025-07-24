package TwelveAssignment;
import java.util.Scanner;
public class InputIntGenLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int input = scanner.nextInt();
        scanner.close();
        // Generate pattern
        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for (int num = -4; num >= -40; num -= 4) {
    System.out.print(num + " ");
}
        System.out.println();
    for (int num = 1; num <= 256; num *= 2) {
    System.out.print(num + " ");
}
for (int num = 1000; num >= 3; num /= 2) {
    System.out.print(num + " ");
}
        System.out.println();
    }
}