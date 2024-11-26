public class Lab4_Task3 {
    // Method to check if a single string is a palindrome
    public static boolean isPalindrome(String str, int start, int end) {
        if (start >= end) {
            return true;  // Base case: If start meets end, it is a palindrome
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false;  // If characters at start and end do not match, it's not a palindrome
        }
        return isPalindrome(str, start + 1, end - 1);  // Recursive call
    }

    // Main method
    public static void main(String[] args) {
        // Array of strings to check for palindrome
        String[] words = {"FAIZ", "MADAM", "ASAD", "DAD"};

        // Loop through each word in the array
        for (String word : words) {
            // Check if the current word is a palindrome
            boolean result = isPalindrome(word, 0, word.length() - 1);
            // Print result for each word
            System.out.println(word + " is " + (result ? "a palindrome" : "not a palindrome"));
        }
    }
}