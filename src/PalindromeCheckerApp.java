public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("Welcome to Palindrome Checker App");

        String input = "Never Odd Or Even";

        // Convert to lowercase and remove spaces
        String processed = input.toLowerCase().replaceAll("\\s+", "");

        String reversed = "";

        for (int i = processed.length() - 1; i >= 0; i--) {
            reversed = reversed + processed.charAt(i);
        }

        if (processed.equals(reversed)) {
            System.out.println(input + " is a Palindrome");
        } else {
            System.out.println(input + " is not a Palindrome");
        }
    }
}