public class Lab3_Task5  {
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;  // Base case: factorial of 1 or 0 is 1
        }
        return n * factorial(n - 1);  // Recursive case
    }

    public static void main(String[] args) {
        System.out.println("The Factorial of is: "+ factorial(12));  // Example input
    }
}