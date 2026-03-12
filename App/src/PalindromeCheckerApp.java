import java.util.Scanner;
/**
 * =====================================================
 * MAIN CLASS - UseCase12PalindromeCheckerApp
 * =====================================================
 *
 * Use Case 12: Strategy Pattern for Palindrome Algorithms
 *
 * Description:
 * This class demonstrates palindrome validation using
 * the Strategy Design Pattern.
 *
 * Different palindrome checking algorithms can be
 * implemented as separate strategies. The main program
 * selects and uses one strategy dynamically.
 *
 * This approach improves flexibility and allows
 * easy extension of new palindrome algorithms
 * without modifying existing code.
 *
 * If the characters match symmetrically,
 * the input string is confirmed as a palindrome.
 *
 * This use case demonstrates how design patterns
 * help organize algorithms in a modular way.
 *
 * @author Hari
 * @version 12.0
 */

// Strategy Interface
interface PalindromeStrategy {
    boolean isPalindrome(String input);
}

// Concrete Strategy Implementation
class SimplePalindromeStrategy implements PalindromeStrategy {

    public boolean isPalindrome(String input) {

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
}

public class PalindromeCheckerApp {

    /**
     * Application entry point for UC12 .
     *
     * @param args Command-line arguments
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Choose strategy
        PalindromeStrategy strategy = new SimplePalindromeStrategy();

        // Take user input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        boolean isPalindrome = strategy.isPalindrome(input);

        // Print result
        if (isPalindrome) {
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is not a Palindrome.");
        }

        scanner.close();
    }
}