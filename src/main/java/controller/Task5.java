// definition of the package in which class definition is placed
package controller;

/**
 * The application entry point.
 * Its only responsibility is to instantiate and run the main PalindromeController.
 * 
 * @version 1.1
 * @author Jakub Tomaszewski
 */
public class Task5 {
    
    /**
     * Constructs a new Task5 instance.
     */
    public Task5() {
    }
    
    /**
     * Main application method.
     * Responsible for initializing the main controller and starting the application flow.
     * 
     * @param args The command-line arguments passed to the application.
     */
    public static void main(String[] args) {
        
        // instantiate the PalindromeController
        PalindromeController controller = new PalindromeController();
        
        // start the application logic
        controller.run(args);
    }
}

