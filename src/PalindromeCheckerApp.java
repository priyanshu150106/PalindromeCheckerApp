public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("Welcome to Palindrome Checker App");

        String word = "Never Odd Or Even";

        PalindromeStrategy strategy = new PalindromeSimpleStrategy();
        // You can switch algorithm here

        boolean result = strategy.isPalindrome(word);

        if(result){
            System.out.println(word + " is a Palindrome");
        }else{
            System.out.println(word + " is not a Palindrome");
        }
    }
}