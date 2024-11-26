import java.util.Scanner;
public class Lab3_Task1 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a non-negative number:");
            int k = scanner.nextInt();

      if (k >= 0) {
              printSequence(k); // Recursion start
      } else {
                System.out.println("Number must be non-negative.");
            }
        }
    }

    public static void printSequence(int k) {
        if (k < 0) {
            return;     /* Ye base case hai, negative value pr
                        program end hojayegA*/           
        }

        // Jo input dia hai whi value print hogi
        System.out.print(k + " ");

        // K-1 pr, jo input hai us se back reverse print hongi till 0
        printSequence(k - 1);
    }
}