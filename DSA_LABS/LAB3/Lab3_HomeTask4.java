public class Lab3_HomeTask4 {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;  // Base case: GCD is found when b is 0
        }
        return gcd(b, a % b);  // Recursive case with a % b
    }

    public static void main(String[] args) {
        System.out.println("The G.C.D is: "+gcd(3618,2726));  // Example to find GCD of 3618 & 2726
    }
}
