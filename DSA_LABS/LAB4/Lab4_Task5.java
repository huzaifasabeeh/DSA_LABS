import java.util.HashSet;
import java.util.Set;

public class Lab4_Task5 {
    public static void main(String[] args) {
        int[] array1 = {18, 2, 5, 4};
        int[] array2 = {3, 4, 18, 5};
        
        int[] mergedArray = mergeAndRemoveDuplicates(array1, array2);
        
        System.out.print("Merged Array without duplicates: ");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
    }

    public static int[] mergeAndRemoveDuplicates(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        
        for (int num : arr1) {
            set.add(num);
        }
        for (int num : arr2) {
            set.add(num);
        }
        
        int[] result = new int[set.size()];
        int i = 0;
        for (int num : set) {
            result[i++] = num;
        }
        
        return result;
    }
}