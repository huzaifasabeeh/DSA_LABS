public class Lab3_Task2 {
    public static String reverseName(String name) {
        if (name.isEmpty()) {
            return "";  // Base case 
        }
      
        return reverseName(name.substring(1)) + name.charAt(0);  // Recursive case
    }
    
    public static void main(String[] args) {
        System.out.println(reverseName("Faiz Ul Karim"));
    }
}