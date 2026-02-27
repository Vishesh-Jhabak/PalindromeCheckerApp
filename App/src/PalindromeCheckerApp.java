import java.util.Scanner;
import java.util.Stack;

// Service class encapsulating palindrome logic
class PalindromeChecker {

    // Public method exposed to client
    public boolean checkPalindrome(String input) {

        if (input == null)
            return false;

        // Preprocessing
        input = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        Stack<Character> stack = new Stack<>();

        // Push all characters into stack
        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }

        // Compare by popping from stack
        for (char ch : input.toCharArray()) {
            if (ch != stack.pop())
                return false;
        }

        return true;
    }
}

// Main application class
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("=== UC11: Object-Oriented Palindrome Service ===");
        System.out.print("Enter a string: ");

        String input = sc.nextLine();

        // Object creation (Encapsulation)
        PalindromeChecker checker = new PalindromeChecker();
        boolean result = checker.checkPalindrome(input);

        if (result)
            System.out.println("Result: The given string is a Palindrome.");
        else
            System.out.println("Result: The given string is NOT a Palindrome.");

        sc.close();
    }
}