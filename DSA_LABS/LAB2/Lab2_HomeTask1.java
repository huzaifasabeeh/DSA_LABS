
import java.util.*;
/**
 *
 * @author USER
 */
//VectorOperations
public class Lab2_HomeTask1 {
    public static void main(String[] args) {
        Vector<Integer> numbers = new Vector<>(Arrays.asList(4, 2, 8, 5, 1, 9));

        // Sort the Vector
        Collections.sort(numbers);

        // Display the largest and smallest numbers
        int largest = Collections.max(numbers);
        int smallest = Collections.min(numbers);

        System.out.println("Sorted Vector: " + numbers);
        System.out.println("Largest Number: " + largest);
        System.out.println("Smallest Number: " + smallest);
    }
}
