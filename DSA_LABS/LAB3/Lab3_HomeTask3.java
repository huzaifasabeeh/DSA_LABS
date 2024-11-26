public class Lab3_HomeTask3 {
    public static boolean isPalindrome(String str, int start, int end) {
        if (start >= end) {
            return true;  // Base case: All characters have been checked
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false;  // If characters don't match, not a palindrome
        }
        return isPalindrome(str, start + 1, end - 1);  // Recursive check for next characters
    }

    public static void main(String[] args) {
        String word = "Faiz";
        System.out.println(isPalindrome(word, 0, word.length() - 1) ? 
         "YES (" +word +") is a PALINDROME" : "NO (" +word +") is not a PALINDROME");
    }
}