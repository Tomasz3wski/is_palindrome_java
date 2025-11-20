
package controller;

// importy
import model.PalindromeModel;
import view.PalindromeView;

import javax.swing.*;


public class Task5 {

    public static void main(String[] args) {
        

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                PalindromeModel model = new PalindromeModel();
 
                PalindromeView view = new PalindromeView();

                new PalindromeController(model, view);
                
        
                view.show();
            }
        });
    }
    
  
    public Task5() {
    }
}