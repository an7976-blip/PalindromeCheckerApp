import java.util.Scanner;
/**
 * =====================================================
 * MAIN CLASS - UseCase10PalindromeCheckerApp
 * =====================================================
 *
 * Use Case 10: Case-Insensitive & Space-Ignored Palindrome
 *
 * Description:
 * This class demonstrates palindrome validation while
 * ignoring letter case and spaces in the input string.
 *
 * The input string is first normalized by converting
 * all characters to lowercase and removing spaces.
 *
 * The cleaned string is then checked using a
 * two-pointer comparison technique.
 *
 * If all characters match, the input string is
 * confirmed as a palindrome.
 *
 * This use case demonstrates how preprocessing
 * techniques can improve palindrome validation.
 *
 * @author Hari
 * @version 10.0
 */

public class PalindromeCheckerApp {

    /**
     * Application entry point for UC10 .
     *
     * @param args Command-line arguments
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Convert to lowercase and remove spaces
        String cleaned = input.toLowerCase().replaceAll("\\s+", "");

        int start = 0;
        int end = cleaned.length() - 1;

        boolean isPalindrome = true;

        // Two-pointer comparison
        while (start < end) {
            if (cleaned.charAt(start) != cleaned.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Print result
        if (isPalindrome) {
            System.out.println(input + " is a Palindrome (ignoring case and spaces).");
        } else {
            System.out.println(input + " is not a Palindrome.");
        }

        scanner.close();
    }
}