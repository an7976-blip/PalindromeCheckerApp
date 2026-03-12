import java.util.Scanner;
import java.util.Deque;
import java.util.LinkedList;
/**
 * =====================================================
 * MAIN CLASS - UseCase7PalindromeCheckerApp
 * =====================================================
 *
 * Use Case 7: Deque-Based Optimized Palindrome Checker
 *
 * Description:
 * This class demonstrates palindrome validation using
 * a Deque (Double Ended Queue) data structure.
 *
 * A Deque allows insertion and removal of elements
 * from both the front and rear ends.
 *
 * Characters are inserted into the deque and then
 * compared by removing from both ends simultaneously.
 *
 * If all characters match, the input string is confirmed
 * as a palindrome.
 *
 * This use case demonstrates efficient symmetric
 * comparison using a single optimized data structure.
 *
 * @author Hari
 * @version 7.0
 */

public class PalindromeCheckerApp {

    /**
     * Application entry point for UC7 .
     *
     * @param args Command-line arguments
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Deque<Character> deque = new LinkedList<>();

        // Take user input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Insert characters into deque
        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }

        boolean isPalindrome = true;

        // Compare characters from both ends
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        if (isPalindrome) {
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is not a Palindrome.");
        }

        scanner.close();
    }
}