public class UC2 {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println("        Palindrome Checker App           ");
        System.out.println("==========================================");
        System.out.println("UC2: Print a Hardcoded Palindrome Result");
        System.out.println("------------------------------------------");

        // Hardcoded string (String Literal)
        String word = "madam";

        // Variable to store reversed string
        String reversed = "";

        // Reverse the string using for loop
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // Check if original and reversed strings are equal
        if (word.equals(reversed)) {
            System.out.println("The word \"" + word + "\" is a PALINDROME.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a PALINDROME.");
        }

        System.out.println("------------------------------------------");
        System.out.println("Program Ended Successfully.");
    }
}