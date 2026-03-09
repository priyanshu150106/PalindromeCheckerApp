public static void main(String[] args) {

    String testString = "madam";

    long start1 = System.nanoTime();
    boolean result1 = reverseMethod(testString);
    long end1 = System.nanoTime();
    long time1 = end1 - start1;

    long start2 = System.nanoTime();
    boolean result2 = twoPointerMethod(testString);
    long end2 = System.nanoTime();
    long time2 = end2 - start2;

    long start3 = System.nanoTime();
    boolean result3 = manualReverseMethod(testString);
    long end3 = System.nanoTime();
    long time3 = end3 - start3;

    System.out.println("String Tested: " + testString);

    System.out.println("Reverse Method: " + result1);
    System.out.println("Execution Time: " + time1 + " ns");

    System.out.println("Two Pointer Method: " + result2);
    System.out.println("Execution Time: " + time2 + " ns");

    System.out.println("Manual Reverse Method: " + result3);
    System.out.println("Execution Time: " + time3 + " ns");
}