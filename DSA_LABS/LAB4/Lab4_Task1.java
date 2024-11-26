public class Lab4_Task1 {
    public static void main(String[] args) {
        int[] array1 = {28, 6, 15, 5};
        int[] array2 = {12, 6, 3, 1};

        // Display original arrays
        System.out.println("Before Swapping:");
        printArrays(array1, array2);

        // Swap elements
        for (int i = 0; i < array1.length; i++) {
            int temp = array1[i];
            array1[i] = array2[i];
            array2[i] = temp;
        }

        // Display swapped arrays
        System.out.println("After Swapping:");
        printArrays(array1, array2);
    }

    public static void printArrays(int[] array1, int[] array2) {
        System.out.print("Array 1: ");
        for (int num : array1) System.out.print(num + " ");
        System.out.print("\nArray 2: ");
        for (int num : array2) System.out.print(num + " ");
        System.out.println();
    }
}
