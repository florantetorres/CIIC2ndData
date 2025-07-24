import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a month number (1 for January, 2 for February, etc.): ");
        int month = scanner.nextInt();
        scanner.close();
        int days = getDaysInMonth(month);
        if (days != -1) {
            System.out.println("The month has " + days + " days.");
        } else {
            System.out.println("Invalid month number. Please enter a number between 1 and 12.");
        }
    }
    public static int getDaysInMonth(int month) {
        switch (month) {
            case 1:  // January
            case 3:  // March
            case 5:  // May
            case 7:  // July
            case 8:  // August
            case 10: // October
            case 12: // December
                return 31;
            case 4:  // April
            case 6:  // June
            case 9:  // September
            case 11: // November
                return 30;
            case 2:  // February
                return 28;
            default:
                return -1; // Invalid month
        }
    }
}