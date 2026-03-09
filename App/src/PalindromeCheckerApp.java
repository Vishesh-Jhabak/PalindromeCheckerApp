import java.util.*;

public class PalindromeCheckerApp {

    // Method 1: Two Pointer
    static boolean twoPointer(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r)
            if (s.charAt(l++) != s.charAt(r--))
                return false;
        return true;
    }

    // Method 2: Stack
    static boolean stackMethod(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) stack.push(c);
        for (char c : s.toCharArray())
            if (c != stack.pop()) return false;
        return true;
    }

    // Method 3: Reverse String
    static boolean reverseMethod(String s) {
        String rev = new StringBuilder(s).reverse().toString();
        return s.equals(rev);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String input = sc.nextLine().replaceAll("\\s+", "").toLowerCase();

        long start, end;

        // Two Pointer
        start = System.nanoTime();
        boolean r1 = twoPointer(input);
        end = System.nanoTime();
        System.out.println("Two Pointer: " + r1 + " | Time: " + (end - start) + " ns");

        // Stack
        start = System.nanoTime();
        boolean r2 = stackMethod(input);
        end = System.nanoTime();
        System.out.println("Stack Method: " + r2 + " | Time: " + (end - start) + " ns");

        // Reverse String
        start = System.nanoTime();
        boolean r3 = reverseMethod(input);
        end = System.nanoTime();
        System.out.println("Reverse Method: " + r3 + " | Time: " + (end - start) + " ns");

        sc.close();
    }
}