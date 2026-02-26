import java.util.Scanner;

public class UC3 {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println("        Palindrome Checker App           ");
        System.out.println("==========================================");
        System.out.println("UC3: Palindrome Check Using String Reverse");
        System.out.println("------------------------------------------");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String original = scanner.nextLine();

        String reversed = "";

        // Reverse string using for loop
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        // Compare original and reversed
        if (original.equals(reversed)) {
            System.out.println("Result: \"" + original + "\" is a PALINDROME.");
        } else {
            System.out.println("Result: \"" + original + "\" is NOT a PALINDROME.");
        }

        System.out.println("------------------------------------------");
        System.out.println("Program Ended Successfully.");

        scanner.close();
    }
}