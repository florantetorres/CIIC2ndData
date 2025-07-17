public class Task8 {
    public static void main(String[] args) {
        calculateCumulativeSums(4, 5, 10);
    }
    public static void calculateCumulativeSums(int... numbers) {
        int totalSum = 0;
        for (int num : numbers) {
            int cumulativeSum = calculateCumulativeSum(num);
            totalSum += cumulativeSum;
            System.out.println("Cumulative sum up to " + num + " is: " + cumulativeSum);
        }
        System.out.println("Total sum is: " + totalSum);
    }
    public static int calculateCumulativeSum(int n) {
        return n * (n + 1) / 2;
    }
}
