package view;

/**
 *
 * @author Jakub Tomaszewski
 */
public class PalindromePrinter {
    
    public void printResults(String palindrome, boolean isPalindrome){
        System.out.println(palindrome + " dlugosc: " + palindrome.length());
        if (isPalindrome){
            System.out.println("Podany wyraz jest palindromem");
        } else {
            System.out.println("Podany wyraz nie jest palindromem");
        }
    }
}
