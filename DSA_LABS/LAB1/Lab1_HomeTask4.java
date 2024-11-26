
public class Lab1_HomeTask4 {
    public static void main(String[] args) {
        String str = "hello world";
        System.out.println("Original String: " + str);
        System.out.println("String after reversing vowels: " + reverseVowels(str));
    }
    public static String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int i = 0, j = arr.length - 1;
        while (i < j) {
            if (!isVowel(arr[i])) {
                i++;
                continue; }
            if (!isVowel(arr[j])) {
                j--;
                continue; }
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return new String(arr);
    }
    private static boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }
}
