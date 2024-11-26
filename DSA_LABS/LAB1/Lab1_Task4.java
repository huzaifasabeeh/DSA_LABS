public class Lab1_Task4{
    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";
        
        String merged = mergeAlternating(word1, word2);
        System.out.println("Merged String: " + merged);
    }
    
    public static String mergeAlternating(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int i = 0, j = 0;
        
        while (i < word1.length() || j < word2.length()) {
            if (i < word1.length()) {
                result.append(word1.charAt(i));
                i++;
            }
            if (j < word2.length()) {
                result.append(word2.charAt(j));
                j++;
            }
        }
        
        return result.toString();
    }
}