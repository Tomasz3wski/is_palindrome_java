
package controller;

// imports
import model.PalindromeModel;
import view.PalindromeView;

import javax.swing.*;

/**
 * The Task5 class serves as the entry point of the Palindrome Analyzer application.
 * It initializes the Model-View-Controller (MVC) structure by creating instances of
 * {@link PalindromeModel}, {@link PalindromeView}, and {@link PalindromeController}.
 * The graphical user interface (GUI) is launched on the Swing Event Dispatch Thread
 * to ensure thread safety.
 * 
 * This class contains the {@code main} method that starts the program.
 * 
 * @version 1.2
 * @author Jakub Tomaszewski
 */
public class Task5 {
    
    /**
     * The main method that starts the Palindrome Analyzer application.
     * It uses {@link SwingUtilities#invokeLater(Runnable)} to ensure that all Swing
     * components are created and updated safely on the Event Dispatch Thread.
     *
     * @param args optional command-line arguments containing a string to analyze
     */
    public static void main(String[] args) {
        

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                PalindromeModel model = new PalindromeModel();
 
                PalindromeView view = new PalindromeView();

                new PalindromeController(model, view, args);
                
        
                view.show();
            }
        });
    }
    
  
    public Task5() {
    }
}