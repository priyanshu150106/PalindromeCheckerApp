public class PalindromeCheckerApp {

    // Method 1: Reverse using StringBuilder
    public static boolean reverseMethod(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    // Method 2: Two Pointer Technique
    public static boolean twoPointerMethod(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Method 3: Manual Reverse Loop
    public static boolean manualReverseMethod(String str) {
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        return str.equals(reversed);
    }

    public static void main(String[] args) {

        String testString = "madam";

        // Reverse Method Timing
        long start1 = System.nanoTime();
        boolean result1 = reverseMethod(testString);
        long end1 = System.nanoTime();
        long time1 = end1 - start1;

        // Two Pointer Timing
        long start2 = System.nanoTime();
        boolean result2 = twoPointerMethod(testString);
        long end2 = System.nanoTime();
        long time2 = end2 - start2;

        // Manual Reverse Timing
        long start3 = System.nanoTime();
        boolean result3 = manualReverseMethod(testString);
        long end3 = System.nanoTime();
        long time3 = end3 - start3;

        // Display Results
        System.out.println("String Tested: " + testString);

        System.out.println("\nReverse Method Result: " + result1);
        System.out.println("Execution Time: " + time1 + " ns");

        System.out.println("\nTwo Pointer Method Result: " + result2);
        System.out.println("Execution Time: " + time2 + " ns");

        System.out.println("\nManual Reverse Method Result: " + result3);
        System.out.println("Execution Time: " + time3 + " ns");
    }
}