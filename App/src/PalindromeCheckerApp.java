import java.util.Scanner;
/**
 * =====================================================
 * MAIN CLASS - UseCase9PalindromeCheckerApp
 * =====================================================
 *
 * Use Case 9: Recursive Palindrome Checker
 *
 * Description:
 * This class demonstrates palindrome validation using
 * the concept of recursion.
 *
 * Recursion allows a method to call itself repeatedly
 * until a base condition is reached.
 *
 * The program compares the first and last characters
 * of the string and recursively checks the remaining
 * substring.
 *
 * If all characters match during recursive calls,
 * the input string is confirmed as a palindrome.
 *
 * This use case demonstrates how recursion can be
 * applied to symmetric string comparison.
 *
 * @author Hari
 * @version 9.0
 */

public class PalindromeCheckerApp {

    /**
     * Application entry point for UC9 .
     *
     * @param args Command-line arguments
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        boolean isPalindrome = checkPalindrome(input, 0, input.length() - 1);

        // Print result
        if (isPalindrome) {
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is not a Palindrome.");
        }

        scanner.close();
    }

    // Recursive method to check palindrome
    public static boolean checkPalindrome(String str, int start, int end) {

        // Base condition
        if (start >= end) {
            return true;
        }

        // If characters do not match
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call
        return checkPalindrome(str, start + 1, end - 1);
    }
}