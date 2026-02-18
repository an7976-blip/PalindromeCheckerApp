/**
 * ====================================================
 * MAIN CLASS UseCase2PalindromeCheckerApp
 * ====================================================
 *
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
 * @Hari Developer
 * @version 2.0
 */

public class UC2PalindromeCheckerApp {
  /**
   *
   * Application entry point for UC2.
   *
   * @Hari args Command-line arguments
    */


        public static void main(String[] args){
            System.out.println("Welcome to the Palindrome Checker Management System \nVersion : 1.0 \nSystem initialized successfully");
            String input="madam";

            System.out.println("Input text: madam");
            System.out.println("Is it a palindrome?:");
            for(int i=0;i<input.length()/2;i++){
                if(input.charAt(i)!=input.charAt(input.length()-i-1)) {
                    System.out.print(" false");
                }else{
                    System.out.print(" True");
                    break;
                }
            }
        }
    }