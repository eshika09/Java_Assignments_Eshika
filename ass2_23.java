import java.util.Scanner;
class TooHot extends Exception {
    public TooHot(String message) {
        super(message);
    }
}
class TooCold extends Exception {
    public TooCold(String message) {
        super(message);
    }
}
public class ass2_23 {
    public static void checkTemperature(double temp) throws TooHot, TooCold {
        if (temp > 35) {
            throw new TooHot("Temperature is too hot!");
        } else if (temp < 5) {
            throw new TooCold("Temperature is too cold!");
        } else {
            System.out.println("Temperature is Normal.");
            double fahrenheit = (temp * 9/5) + 32;
            System.out.printf("Converted temperature in Fahrenheit: %.2f°F%n", fahrenheit);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temperature in Celsius: ");
        
        try {
            double temperature = scanner.nextDouble();
            checkTemperature(temperature);
        } catch (TooHot e) {
            System.out.println(e.getMessage());
        } catch (TooCold e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Please enter a valid number.");
        } finally {
            scanner.close();
        }
    }
}