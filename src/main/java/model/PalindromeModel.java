// definition of the package in which class definition is placed
package model;

// used imports in this file
import java.util.ArrayList;

/**
 * Model class in Palindrome app. 
 * Contains the data and core logic for analyzing a string.
 * It stores the analysis results (state) and provides accessors (getters, setters) 
 * for the Controller and View.
 * 
 * @version 1.1
 * @author Jakub Tomaszewski
 */
public class PalindromeModel {    
    
    /**
     * Constructs a new PalindromeModel instance.
     */
    public PalindromeModel() {
    }
    
    /** The normalized input string currently being analyzed. */
    private String input;
    
    /** Flag indicating whether the analyzed string is a palindrome. */
    private boolean isPalindrome = true;
    
     /** List storing strings detailing the position and characters of mismatches found */
    private ArrayList<String> differences = new ArrayList<>();
    
    /**
     * Executes the palindrome analysis on the given string.
     * This method calculates the palindrome status and any differences found.
     * 
     * @param input The normalized string (lowercase, no spaces) to be analyzed.
     * @throws EmptyInputException If the input string is null or empty after normalization
     */
    public void analyze(String input) throws EmptyInputException {
        
        // set default
        this.differences.clear(); 
        this.isPalindrome = true;
        
        if (input == null || input.isEmpty()) {
            throw new EmptyInputException("Cannot analyze an empty string...");
        }
        
        this.input = input;
        
        // check for differences
        for (int i=0; i<input.length()/2; i++){
            if (input.charAt(i) != input.charAt(input.length()-i-1)){
                // store result (difference) as data for the View
                String diff = "character " + (i + 1) + " ('" + input.charAt(i) + "')" + " differs from character " + (input.length() - i) + " ('" + input.charAt((input.length() - i - 1)) + "').";
                this.differences.add(diff);
                this.isPalindrome = false;
            }
        }
    }
    
    /**
     * Retrieves the input string stored in the Model.
     * @return The stored normalized input string.
     */
    public String getInput(){
        return this.input;
    }
    
    /**
     * Retrieves the result of the palindrome analysis.
     * @return True if the string is a palindrome, false otherwise.
     */
    public boolean getIsPalindrome() {
        return this.isPalindrome;
    }

    /**
     * Retrieves the list of found differences.
     * @return A list of strings detailing character mismatches.
     */
    public ArrayList<String> getDifferences() {
        return this.differences;
    }
}
