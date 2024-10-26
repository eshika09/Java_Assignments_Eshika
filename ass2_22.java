import java.util.Scanner;
class CustomArithmeticException extends Exception {
    public CustomArithmeticException(String message) {
        super(message);
    }
}
public class ass2_22 {
    public static void calculate(int a, int b) throws CustomArithmeticException {
        if (b == 0) {
            throw new CustomArithmeticException("Error: Division by zero is not allowed.");
        }
        double divisionResult = (double) a / b;
        System.out.println("Division Result: " + divisionResult);
        if (a < 0) {
            throw new CustomArithmeticException("Error: Cannot calculate the square root of a negative number.");
        }

        double sqrtResult = Math.sqrt(a);
        System.out.println("Square Root Result: " + sqrtResult);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter the first number (for square root): ");
        int a = scanner.nextInt();
        
        System.out.print("Enter the second number (for division): ");
        int b = scanner.nextInt();
        
        try {
            
            calculate(a, b);
        } catch (CustomArithmeticException e) {

            System.out.println(e.getMessage());
        } finally {
            
            scanner.close();
        }
    }
}