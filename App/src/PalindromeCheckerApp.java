import java.util.Scanner;
/**
 * =====================================================
 * MAIN CLASS - UseCase13PalindromeCheckerApp
 * =====================================================
 *
 * Use Case 13: Performance Comparison
 *
 * Description:
 * This class demonstrates performance comparison
 * between two palindrome checking approaches.
 *
 * The execution time of each algorithm is measured
 * using System.nanoTime().
 *
 * The program compares:
 * - Iterative two-pointer palindrome algorithm
 * - Recursive palindrome algorithm
 *
 * The execution times are displayed so that users
 * can observe the performance difference between
 * the algorithms.
 *
 * This use case helps understand algorithm efficiency
 * and time measurement in Java.
 *
 * @author Hari
 * @version 13.0
 */

public class PalindromeCheckerApp {

    /**
     * Application entry point for UC13 .
     *
     * @param args Command-line arguments
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Iterative method timing
        long startTime1 = System.nanoTime();
        boolean iterativeResult = iterativePalindrome(input);
        long endTime1 = System.nanoTime();

        // Recursive method timing
        long startTime2 = System.nanoTime();
        boolean recursiveResult = recursivePalindrome(input, 0, input.length() - 1);
        long endTime2 = System.nanoTime();

        // Print results
        System.out.println("\nIterative Method Result: " + iterativeResult);
        System.out.println("Iterative Execution Time: " + (endTime1 - startTime1) + " ns");

        System.out.println("\nRecursive Method Result: " + recursiveResult);
        System.out.println("Recursive Execution Time: " + (endTime2 - startTime2) + " ns");

        scanner.close();
    }

    // Iterative palindrome check
    public static boolean iterativePalindrome(String input) {

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    // Recursive palindrome check
    public static boolean recursivePalindrome(String input, int start, int end) {

        if (start >= end) {
            return true;
        }

        if (input.charAt(start) != input.charAt(end)) {
            return false;
        }

        return recursivePalindrome(input, start + 1, end - 1);
    }
}