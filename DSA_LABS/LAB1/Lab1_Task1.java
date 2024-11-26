public class Lab1_Task1 {
    public static void main(String[] args) {
        // String literals
        String name = "Faiz Ul Karim Siddiqui";
        String username = "faizul_2004";
        
        // New keyword
        String name2 = new String("Ashar");
        
        // Using intern method
        String name3 = name2.intern();
        
        // Check immutability
        name2.concat("Shahid");
        // Print the strings
        System.out.println("Name: " + name);            
        System.out.println("Username: " + username);    
        System.out.println("Name2: " + name2);          
        System.out.println("Name3 (interned): " + name3);
    }
}