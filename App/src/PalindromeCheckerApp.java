import java.util.Scanner;

public class PalindromeCheckerApp {

    static boolean isPalindrome(String input) {

        // Step 1: Normalize string (ignore spaces & case)
        input = input.replaceAll("\\s+", "").toLowerCase();

        // Step 2: Two-pointer comparison
        int left = 0, right = input.length() - 1;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("=== UC10: Case-Insensitive & Space-Ignored Palindrome ===");
        System.out.print("Enter a string: ");

        String input = sc.nextLine();

        boolean result = isPalindrome(input);

        if (result)
            System.out.println("Result: The given string is a Palindrome.");
        else
            System.out.println("Result: The given string is NOT a Palindrome.");

        sc.close();
    }
}