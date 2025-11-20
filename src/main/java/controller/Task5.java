/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package controller;

import model.PalindromeModel;
import view.PalindromePrinter;


/**
 *
 * @author Jakub Tomaszewski
 */
public class Task5 {
    
    public static boolean isPalindrome(String palindrome){
        boolean p = true;
        for (int i=0; i<palindrome.length()/2; i++){
            if (palindrome.charAt(i) != palindrome.charAt(palindrome.length()-i-1)){
                System.out.println("znak " + (i+1) + " (" + palindrome.charAt(i) + ")" + " rozni sie od znaku " + (palindrome.length()-i)+ " (" + palindrome.charAt((palindrome.length()-i-1)) + ").");
                p = false;
            }
        }
        return p;
    }
    /**
     * Main method for ckecking if given parameter is a palindrome.
     * 
     * @param args app call parameters
     */
    public static void main(String[] args) {
        String palindrome = String.join("", args);
        palindrome = palindrome.toLowerCase();
        PalindromeModel view = new PalindromeModel();
        PalindromePrinter print = new PalindromePrinter();
        print.printResults(palindrome, isPalindrome(palindrome));
        
        
        //view.setPalindrome(palindrome);
        //System.out.println(view.getPalindrome());
        
        
    }
    
}

