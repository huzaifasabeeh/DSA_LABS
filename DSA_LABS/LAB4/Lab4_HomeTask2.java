public class Lab4_HomeTask2 {
    public static void main(String[] args) {
        int[] numbers = {7, 5, 3, 19, 4, 11, 7};
        int key = 4;
        splitArray(numbers, key); }
    
    public static void splitArray(int[] arr, int key) {
        int index = -1; 
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                index = i;
                break; }}
            
        if (index == -1) {
            System.out.println("Key not found in the array.");
            return;}
       
        System.out.print("First part: ");
        for (int i = 0; i <= index; i++) {
            System.out.print(arr[i] + " ");}
        System.out.println();
        
        System.out.print("Second part: ");
        for (int i = index + 1; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }}