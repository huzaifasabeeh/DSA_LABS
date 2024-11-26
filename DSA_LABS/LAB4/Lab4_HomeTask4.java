public class Lab4_HomeTask4 {
    public static void main(String[] args) {
        int[] numbers = {0,1,2,3,5};
        int missing = findMissingNumber(numbers);
        
        System.out.println("The missing number is: " + missing);
    }

    public static int findMissingNumber(int[] arr) {
        int n = arr.length;
        int totalSum = n * (n + 1) / 2; // Sum of numbers from 0 to n
        int arraySum = 0;
        
        for (int num : arr) {
            arraySum += num;
        }
        
        return totalSum - arraySum;
    }
}