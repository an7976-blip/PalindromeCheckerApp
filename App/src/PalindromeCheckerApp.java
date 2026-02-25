import java.util.Scanner;
/**
 * =====================================================
 * MAIN CLASS - UseCase3PalindromeCheckerApp
 * =====================================================
 *
 * Use Case 3: Reverse String Based Palindrome Check
 *
 * Description:
 * This class checks whether a string is a palindrome
 * by reversing the string and comparing it with
 * the original value.
 *
 * At this stage, the application:
 * - Accepts string input from the user
 * - Iterates the string in reverse order
 * - Builds a reversed version
 * - Compares original and reversed strings
 * - Displays the validation result
 *
 * This introduces transformation-based validation.
 *
 * @author Developer
 * @version 3.0
 */

public class PalindromeCheckerApp {

    /**
     * Application entry point for UC3.
     *
     * @param args Command-line arguments
     */




        public static void main(String[] args) {

            // Scanner object for user input
            Scanner scanner = new Scanner(System.in);

            // user to enter a string
            System.out.print("Enter a string: ");
            String original = scanner.nextLine();

            // Variable to store reversed string
            String reversed = "";

            // Reverse string using for loop
            for (int i = original.length() - 1; i >= 0; i--) {
                reversed = reversed + original.charAt(i);
            }

            //  original and reversed string
            if (original.equals(reversed)) {
                System.out.println(original + " is a Palindrome.");
            } else {
                System.out.println(original + " is not a Palindrome.");
            }


            scanner.close();
        }
    }