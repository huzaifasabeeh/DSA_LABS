import java.util.ArrayList;
import java.util.List;

public class Lab4_HomeTask3 {
    public static void main(String[] args) {
        int[] numbers = {10, 1, 2, 7, 6, 5};
        int target = 8;
        
        List<List<Integer>> combinations = findCombinations(numbers, target, 0, new ArrayList<>());
        System.out.println("Unique combinations that sum up to " + target + ":");
        for (List<Integer> combination : combinations) {
            System.out.println(combination);
        } }
    public static List<List<Integer>> findCombinations(int[] arr, int target, int index, List<Integer> current) {
        List<List<Integer>> result = new ArrayList<>();
        
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return result;
        }

        for (int i = index; i < arr.length; i++) {
            if (arr[i] <= target) {
                current.add(arr[i]);
               
                result.addAll(findCombinations(arr, target - arr[i], i + 1, current));
                
                current.remove(current.size() - 1);
            }}
        return result;
    } }