
public class Lab1_HomeTask2 {
    public static void main(String[] args) {
        int number = 123456;
        int evenCount = 0, oddCount = 0;
        Integer numWrapper = number;
        
        while (numWrapper > 0) {
            int digit = numWrapper % 10;
            if (digit % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            numWrapper /= 10; // Unboxing hota hai yahan
        }
        
        System.out.println("Even digits: " + evenCount);
        System.out.println("Odd digits: " + oddCount);
    }
}
