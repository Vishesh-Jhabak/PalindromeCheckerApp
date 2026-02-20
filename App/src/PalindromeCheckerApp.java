/*
 * Application entry point.
 *
 * This is the first method executed by the JVM
 * when the program starts
 *
 * @author Developer
 * @Version 1.0
 */

import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the srting : ");
        String original = sc.nextLine();
        String reversed ="";
        for (int i =original.length() -1; i>=0; i--){
            reversed = reversed + original.charAt(i);
        }
        if (original.equals(reversed)) {
            System.out.println(" The string \"" + original + "\" is a Palindrome" );
        } else {
            System.out.println(" The string \"" + original + "\" is not a Palindrome" );
        }
        sc.close();
    }
}