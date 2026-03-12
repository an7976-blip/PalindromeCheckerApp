import java.util.Scanner;
/**
 * =====================================================
 * MAIN CLASS - UseCase11PalindromeCheckerApp
 * =====================================================
 *
 * Use Case 11: Object-Oriented Palindrome Service
 *
 * Description:
 * This class demonstrates palindrome validation using
 * Object-Oriented Programming principles.
 *
 * The palindrome checking logic is separated into a
 * service class, which improves modularity,
 * reusability, and maintainability of the code.
 *
 * The main class handles user input and output,
 * while the service class performs the palindrome
 * validation logic.
 *
 * If the characters match symmetrically,
 * the input string is confirmed as a palindrome.
 *
 * This use case demonstrates how OOP design can
 * organize program logic into reusable components.
 *
 * @author Hari
 * @version 11.0
 */

class PalindromeService {

    // Method to check palindrome
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
     * Application entry point for UC11 .
     *
     * @param args Command-line arguments
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Create service object
        PalindromeService service = new PalindromeService();

        // Take user input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        boolean isPalindrome = service.isPalindrome(input);

        // Print result
        if (isPalindrome) {
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is not a Palindrome.");
        }

        scanner.close();
    }
}