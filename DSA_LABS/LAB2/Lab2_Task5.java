import java.util.*;

public class Lab2_Task5 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
        int k = 2;

        System.out.println(k + "-th smallest element: " + numbers.get(k - 1));
    }
}