import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author USER
 */
//Fibonacci-Memoization
public class Lab3_HomeTask1 {
    private Map<Integer, Integer> memo = new HashMap<>();  // HashMap to store calculated Fibonacci numbers

    public int fibonacci(int n) {
        if (n == 0) return 0;  // Base case: the 0th Fibonacci number is 0
        if (n == 1) return 1;  // Base case: the 1st Fibonacci number is 1

        
        int result = fibonacci(n - 1) + fibonacci(n - 2);  // Recursive calculation
        memo.put(n, result);  // Store the result in memo map
        return result;
    }

    public static void main(String[] args) {
        Lab3_HomeTask1 fib = new Lab3_HomeTask1();
        System.out.println("THE 12TH Term of Fibonacci Series is: " 
                + fib.fibonacci(12));  // Example input to find 5th Fibonacci number
    }
}
