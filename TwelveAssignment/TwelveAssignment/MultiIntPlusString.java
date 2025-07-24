package TwelveAssignment;

public class MultiIntPlusString {
  
    public static void main(String[] args) {
        System.out.println("Multiplication Table (10 x 10 to 10 x 100):");
        for (int i = 10; i <= 100; i += 10) {
            System.out.printf("10 x %d = %d\n", i / 10, i);
        }
    }
}