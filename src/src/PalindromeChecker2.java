import java.util.Scanner;

public class PalindromeChecker2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        scanner.close();

        String transform = transformInput(input);
        boolean isPalindrome = checkPalindrome(transform);

        if (isPalindrome) {
            System.out.println("The input is a palindrome.");
        } else {
            System.out.println("Input is not a palindrome.");
        }
    }

    public static String transformInput(String input) {
        return input.toLowerCase().replaceAll("[,!]", "");
    }

    public static boolean checkPalindrome(String input) {
        String reversed = reverseString(input);
        return input.equals(reversed);
    }

    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder(input.length());
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }
}
