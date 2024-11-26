import java.util.Scanner;
//HashCodeExample
public class Lab2_HomeTask2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String input = sc.nextLine();
            
            // Display hash code
            System.out.println("HashCode of '" + input + "': " + input.hashCode());
        }
    }
}