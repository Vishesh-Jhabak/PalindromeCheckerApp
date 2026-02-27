import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class PalindromeCheckerApp {

    // Method to check palindrome using Queue and Stack
    public static boolean isPalindrome(String input) {

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        // Insert characters into both Stack and Queue
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            stack.push(ch);      // LIFO
            queue.add(ch);       // FIFO
        }

        // Compare dequeue (queue) with pop (stack)
        while (!stack.isEmpty()) {
            if (!queue.remove().equals(stack.pop())) {
                return false;   // Not a palindrome
            }
        }

        return true;   // Is a palindrome
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== UC6: Queue + Stack Based Palindrome Check ===");
        System.out.print("Enter a string: ");

        String input = scanner.nextLine();

        boolean result = isPalindrome(input);

        if (result) {
            System.out.println("The given string is a Palindrome.");
        } else {
            System.out.println("The given string is NOT a Palindrome.");
        }

        scanner.close();
    }
}