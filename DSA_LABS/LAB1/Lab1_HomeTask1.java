
public class Lab1_HomeTask1{
    public static void main(String[] args) {
        // Autoboxing example
        int num = 10;
        Integer numWrapper = num; // primitive int ko Integer wrapper class mein convert kar diya
        
        // Wrapper class methods
        System.out.println("Number: " + numWrapper);
        System.out.println("Double value: " + numWrapper.doubleValue()); // double mein convert
        System.out.println("Byte value: " + numWrapper.byteValue()); // byte mein convert
        System.out.println("Hashcode: " + numWrapper.hashCode()); // hash code return
    }
}
