 import java.util.Scanner;
 
public class ass2_17 {
    class ConsecutiveDigitSum{
        public static int sumOfConsecutiveDigits(String number) {
            int sum = 0;
    
        
            for (int i = 0; i < number.length() - 1; i++) {
                int twoDigitNumber = (number.charAt(i) - '0') * 10 + (number.charAt(i + 1) - '0');
                sum += twoDigitNumber;
            }
    
            return sum;
        }}
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Accepting a number from the user
        System.out.print("Enter a number: ");
        String inputNumber = scanner.nextLine();

        


        
        
    }
}
