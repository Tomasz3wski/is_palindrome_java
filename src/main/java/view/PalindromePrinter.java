// definition of the package in which class definition is placed
package view;

// used imports in this file
import java.util.ArrayList;

/**
 * View class in Palindrome app. 
 * Responsible for presenting results to the user (outputting to the console).
 * 
 * @version 1.1
 * @author Jakub Tomaszewski
 */
public class PalindromePrinter {
    
    /**
     * Constructs a new PalindromePrinter instance.
     */
    public PalindromePrinter() {
    }
    
    /**
     * Prints the results, including the normalized input, the palindrome status, 
     * and a list of differences if the string is not a palindrome.
     * 
     * @param input The normalized string (lowercase, no spaces) that was analyzed.
     * @param isPalindrome The boolean result from the Model indicating if the string is a palindrome.
     * @param differences A list of strings detailing the position of character mismatches.
     */
    public void printResults(String input, boolean isPalindrome, ArrayList<String> differences){
        System.out.println(input + " length: " + input.length());
        if (isPalindrome){
            System.out.println("The given string is a palindrome");
        } else {
            System.out.println("The given string is not a palindrome");
            
            // prints all mismatches
            System.out.println("Mismatches:");
            for (String diff : differences) {   
                System.out.println("- " + diff);
            }
        }
    }
}
