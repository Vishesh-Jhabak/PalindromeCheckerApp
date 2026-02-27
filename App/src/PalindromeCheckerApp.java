import java.util.Scanner;

public class PalindromeCheckerApp {

    // Method to check palindrome using char array and two-pointer technique
    public static boolean isPalindrome(String input) {

        // Convert string to char array
        char[] characters = input.toCharArray();

        int start = 0;
        int end = characters.length - 1;

        // Two-pointer approach
        while (start < end) {
            if (characters[start] != characters[end]) {
                return false;   // Not a palindrome
            }
            start++;
            end--;
        }

        return true;   // Is a palindrome
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== UC4: Character Array Based Palindrome Check =");
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