public class ass2_19{
    public static void main(String[] args) {
        try {
            int size = -5;
            int[] array = new int[size];
        } catch (NegativeArraySizeException e) {
            System.out.println("Caught NegativeArraySizeException: " + e.getMessage());
        }
        try {
            int numerator = 10;
            int denominator = 0;
            int result = numerator / denominator; 
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }

        
        System.out.println("Program continues after handling exceptions.");
    }
}