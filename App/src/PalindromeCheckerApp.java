import java.util.Scanner;
import java.util.LinkedList;
/**
 * =====================================================
 * MAIN CLASS - UseCase8PalindromeCheckerApp
 * =====================================================
 *
 * Use Case 8: Linked List Based Palindrome Checker
 *
 * Description:
 * This class demonstrates palindrome validation using
 * a Linked List data structure.
 *
 * Characters of the input string are inserted into the
 * linked list and then compared using the two-pointer
 * technique from both ends of the list.
 *
 * If all characters match, the input string is confirmed
 * as a palindrome.
 *
 * This use case demonstrates how linked lists can be
 * used for sequential storage and symmetric comparison.
 *
 * @author Hari
 * @version 8.0
 */

public class PalindromeCheckerApp {

    /**
     * Application entry point for UC8 .
     *
     * @param args Command-line arguments
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        LinkedList<Character> list = new LinkedList<>();

        // Take user input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Insert characters into LinkedList
        for (int i = 0; i < input.length(); i++) {
            list.add(input.charAt(i));
        }

        boolean isPalindrome = true;

        // Two-pointer approach using LinkedList
        while (list.size() > 1) {
            if (!list.removeFirst().equals(list.removeLast())) {
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