public class Lab4_HomeTask1 {
    public static void main(String[] args) {
        double[] numbers = {2.5, 3.1, 4.7, 6.0, 1.9, 8.3, 7.4};
        
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        
        double mean = sum / numbers.length;
        
        System.out.println("Sum: " + sum);
        System.out.println("Mean: " + mean);
    }
}