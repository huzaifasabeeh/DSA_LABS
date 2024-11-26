import java.util.*;

/**
 *
 * @author USER
 */
//VectorExample
public class Lab2_Task1 {
    public static void main(String[] args) {
        Vector<Integer> numbers = new Vector<>();
        int sum = 0;

        // Initialize Vector with 10 integers
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
            sum += i;
        }
        System.out.println("Made by Faiz Ul Karim");
        // Display all integers
        System.out.println("Integers in Vector: " + numbers);
        
        // Display sum of integers
        
        System.out.println("Sum of Integers: " + sum);
    }
}