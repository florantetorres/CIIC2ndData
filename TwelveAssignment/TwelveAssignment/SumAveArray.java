package TwelveAssignment;

import java.util.Scanner;
public class SumAveArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over
        String[] names = new String[numStudents];
        String[] ids = new String[numStudents];
        double[] grades = new double[numStudents];
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter information for Student " + (i + 1));
            System.out.print("Name: ");
            names[i] = scanner.nextLine();
            System.out.print("ID: ");
            ids[i] = scanner.nextLine();
            System.out.print("Grade: ");
            grades[i] = scanner.nextDouble();
            scanner.nextLine(); // Consume newline left-over
        }
        scanner.close();
        // Calculate sum and average of grades
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        double average = sum / numStudents;
        // Display student information and average grade
        System.out.println("\nStudent Information:");
        for (int i = 0; i < numStudents; i+=1) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("Name: " + names[i]);
            System.out.println("ID: " + ids[i]);
            System.out.println("Grade: " + grades[i]);
            System.out.println();
        }
        System.out.println("Sum of grades: " + sum);
        System.out.println("Average grade: " + average);
    }
}
