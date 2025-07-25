import java.util.*;
public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        System.out.println("Results:");
        System.out.println("Addition: " + num1 + " + " + num2 + " = " + add(num1, num2));
        System.out.println("Subtraction: " + num1 + " - " + num2 + " = "+ subtract(num1, num2));
        System.out.println("Multiplication: " + num1 + " X " + num2 + " = "+ multiply(num1, num2));
        if (num2 != 0) {
            System.out.println("Division: " + num1 + " / " + num2 + " = "+ divide(num1, num2));
        } else {
            System.out.println("Cannot divide by zero.");
        }
        scanner.close();
    }
    public static double add(double num1, double num2) {
        return num1 + num2;
    }
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }
    public static double divide(double num1, double num2) {
        return num1 / num2;
    }
}