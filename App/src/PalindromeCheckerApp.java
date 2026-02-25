/**
 * =====================================================
 * MAIN CLASS UseCase2PalindromeCheckerApp
 * =====================================================
 * Use Case 2: Hardcoded Palindrome Validation
 *
 * Description:
 * This class demonstrates basic palindrome validation
 * using a hardcoded string value.
 *
 * At this stage, the application:
 * - Stores a predefined string
 * - Compares characters from both ends
 * - Determines whether the string is a palindrome
 * - Displays the result on the console
 *
 * This use case introduces fundamental comparison logic
 * before using advanced data structures.
 *
 * @author Developer
 * @version 2.0
 */
public class PalindromeCheckerApp {

    /**
     * Application entry point for UC2.
     *
     * @param args Command-line arguments
     */
        public static void main(String[] args) {

            // Hardcoded string
            String word = "madam";

            // Reverse the string
            String reversed = "";

            for (int i = word.length() - 1; i >= 0; i--) {
                reversed = reversed + word.charAt(i);
            }

            // Check if palindrome
            if (word.equals(reversed)) {
                System.out.println(word + " is a Palindrome.");
            } else {
                System.out.println(word + " is not a Palindrome.");
            }
        }
    }
