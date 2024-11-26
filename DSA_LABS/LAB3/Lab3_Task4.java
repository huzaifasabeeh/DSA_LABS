public class  Lab3_Task4 {
    public static int sumArray(int[] arr, int index) {
        if (index < 0) {
            return 0;  // Base case: no elements left, return 0
        }
        return arr[index] + sumArray(arr, index - 1);  // Recursive call
    }

    public static void main(String[] args) {
        int[] array = {54,28,15,6,53};
        System.out.println("Sum of Given array: "+sumArray(array, array.length - 1));
    }
}