/*
 * Application entry point.
 *
 * This is the first method executed by the JVM
 * when the program starts
 *
 * @author Developer
 * @Version 1.0
 */


import java.sql.SQLOutput;

public class PalindromeCheckerApp {
    public static void main(String[] args){
        String word = "madam";
        String reversed ="";
        for (int i =word.length() -1; i>=0; i--){
            reversed = reversed +word.charAt(i);
        }
        if (word.equals(reversed)) {
            System.out.println("The string \"" + word + "\" is a Palindrome" );
        } else {
            System.out.println("The string \"" + word + "\" is not a Palindrome" );
        }
    }
}
