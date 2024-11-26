public class Lab1_Task2 {
    public static void main(String[] args) {
        double primitiveDouble = 25.75;
        
        // Converting primitive double to Wrapper Double
        Double wrapperDouble = Double.valueOf(primitiveDouble);
        
        System.out.println("Primitive Double: " + primitiveDouble);
        System.out.println("Wrapper Double: " + wrapperDouble);
    }
}