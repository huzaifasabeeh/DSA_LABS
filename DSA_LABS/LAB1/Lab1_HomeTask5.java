
public class Lab1_HomeTask5 {
    public static void main(String[] args) {
        String sentence = "Java programming is fun";
        System.out.println("Longest word: " + findLongestWord(sentence));
    }
    
    public static String findLongestWord(String sentence) {
        String[] words = sentence.split(" ");
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }
}
