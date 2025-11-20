// definition of the package in which class definition is placed
package model;

/**
 * Custom exception class thrown by the PalindromeModel when the input string is empty
 * or consists only of whitespace after normalization.
 * 
 */
public class EmptyInputException extends Exception {
    
    /**
     * Constructs an instance of the exception with the specified detail message.
     * @param message The detail message.
     */
    public EmptyInputException(String message) {
        super(message);
    }
}