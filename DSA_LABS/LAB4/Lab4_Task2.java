public class Lab4_Task2 {
    public static void main(String[] args) {
        int[] array1 = {28, 6, 15, 5};
        int[] array2 = {27, 3, 29, 12};
        
        int[] mergedArray = mergeArrays(array1, array2);
        
        System.out.print("Merged Array: ");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
    }
    
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i];
        }
        
        for (int i = 0; i < arr2.length; i++) {
            result[arr1.length + i] = arr2[i];
        }
        
        return result;
    }
}