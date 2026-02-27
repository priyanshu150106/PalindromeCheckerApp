import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("Welcome to Palindrome Checker Application");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String input = scanner.nextLine();

        char[] characters = input.toCharArray();

        boolean isPalindrome = true;

        int start = 0;
        int end = characters.length - 1;

        while (start < end) {
            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println(input + " is a Palindrome");
        } else {
            System.out.println(input + " is not a Palindrome");
        }

        scanner.close();
    }
}