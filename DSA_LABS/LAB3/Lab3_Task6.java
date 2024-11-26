public class  Lab3_Task6  {
    public static int countdigits(int number) {
        if (number == 0) {
            return 0;  // Base case: if number is 0, no more digits
        }
        return 1 + countdigits(number / 10);  // Recursive call
    }

    public static void main(String[] args) {
        System.out.println("The digits counts of given value is: "
                +countdigits(53545354));  // Example input
    }
}
