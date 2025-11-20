// definition of the package in which class definition is placed
package model;

// used imports in this file
import java.util.ArrayList;
import lombok.*;

/**
 * Model class in Palindrome app. 
 * Contains the data and core logic for analyzing a string.
 * It stores the analysis results (state) and provides accessors (getters, setters) 
 * for the Controller and View.
 * 
 * @version 1.2
 * @author Jakub Tomaszewski
 */
@Getter
@Setter
public class PalindromeModel {    
    
    /**
     * Constructs a new PalindromeModel instance.
     */
    public PalindromeModel() {
        this.differences = new ArrayList<>();
        this.status = AnalysisStatus.EMPTY;
    }
    
    /** The normalized input string currently being analyzed. */
    private String input;
    
    /** Enum indicating whether the analyzed string is a palindrome. */
    private AnalysisStatus status;
    
     /** List storing strings detailing the position and characters of mismatches found */
    private ArrayList<Mismatch> differences = new ArrayList<>();
    
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
        
        if (input == null || input.isEmpty()) {
            this.status = AnalysisStatus.EMPTY;
            throw new EmptyInputException("Cannot analyze an empty string...");
        }
        
        this.input = input;
        
        // check for differences
        for (int i=0; i<input.length()/2; i++){
            if (input.charAt(i) != input.charAt(input.length()-i-1)){
                int pos1 = i + 1;
                char char1 = input.charAt(i);
                int pos2 = input.length() - i;
                char char2 = input.charAt(input.length() - i - 1);
                
                this.differences.add(new Mismatch(pos1, char1, pos2, char2));
            }
        }
        if (this.differences.isEmpty()) {
            this.status = AnalysisStatus.PALINDROME;
        } else {
            this.status = AnalysisStatus.NOT_PALINDROME;
        }
    }
}
