// definition of the package in which class definition is placed
package controller;

// used imports in this file
import java.util.Scanner;
import model.EmptyInputException;
import model.PalindromeModel;
import view.PalindromePrinter;

/**
 * Controller class in Palindrome app. 
 * 
 * @version 1.1
 * @author Jakub Tomaszewski
 */
public class PalindromeController {
    
    /**
     * Constructs a new PalindromeController instance.
     */
    public PalindromeController() {
    }
    
    /**
     * Initiates the application flow.
     * Responsible for getting user input, triggering the Model's analysis, 
     * and displaying results via the View.
     * 
     * @param args The application expects command-line arguments (the string to analyze). 
     * If empty, interactive console input is used.
     */
    public void run(String[] args) { 
        /** String representing the given parameter or user input. */
        String input;
        
        // input handling
        if(args.length == 0) {
            try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Input the string to analyze: ");
            input = scanner.nextLine();
            }
        } 
        else {
            // join all args into a single string
            input = String.join("", args);
        }
        
        // input normalization
        // remove whitespace characters
        input = input.replaceAll("\\s+", "");
        // convert to lowercase
        input = input.toLowerCase();
        
        // MVC initialization
        PalindromeModel model = new PalindromeModel();
        PalindromePrinter printer = new PalindromePrinter();
        
        // custom exceptions thrown
        try {
            model.analyze(input);
            
            // print results
            printer.printResults(input, model.getIsPalindrome(), model.getDifferences());
            
        } 
        catch (EmptyInputException e) { // catching the custom exception
            System.err.println("ERROR: " + e.getMessage());
        }
    }
}
