import java.util.*;

interface PalindromeStrategy {
    boolean check(String s);
}

// Stack Strategy
class StackStrategy implements PalindromeStrategy {
    public boolean check(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) stack.push(c);
        for (char c : s.toCharArray())
            if (c != stack.pop()) return false;
        return true ;
    }
}

class DequeStrategy implements PalindromeStrategy {
    public boolean check(String s) {
        Deque<Character> dq = new ArrayDeque<>();
        for (char c : s.toCharArray()) dq.add(c);

        while (dq.size() > 1)
            if (dq.removeFirst() != dq.removeLast()) return false;

        return true;
    }
}

// Context class
class PalindromeChecker {
    private PalindromeStrategy strategy;

    public PalindromeChecker(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean checkPalindrome(String s) {
        s = s.replaceAll("\\s+", "").toLowerCase();
        return strategy.check(s);
    }
}

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Stack Strategy");
        System.out.println("2. Deque Strategy");
        System.out.print("Choose strategy: ");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter string: ");
        String input = sc.nextLine();

        PalindromeStrategy strategy;

        if (choice == 1)
            strategy = new StackStrategy();
        else
            strategy = new DequeStrategy();

        PalindromeChecker checker = new PalindromeChecker(strategy);

        if (checker.checkPalindrome(input))
            System.out.println("Palindrome ");
        else
            System.out.println("Not a Palindrome ");

        sc.close();
    }
}