public class Lab1_Task3{
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String str3 = "Java";
        String str4 = "Programming";
        String str5 = "Language";
        
        // Concatenating all strings
        String concatenated = str1 + " " + str2 + " " + str3 + " " + str4 + " " + str5;
        System.out.println("Concatenated String: " + concatenated);
        
        // Converting fourth string to uppercase
        System.out.println("Uppercase of fourth string: " + str4.toUpperCase());
        
        // Substring from 8th index onward
        System.out.println("Substring from index 8: " + concatenated.substring(8));
    }
}