import java.util.Scanner;

// Custom exception for invalid username
class InvalidUsernameException extends Exception {
    public InvalidUsernameException(String message) {
        super(message);
    }
}

// Custom exception for password mismatch
class PasswordMismatchException extends Exception {
    public PasswordMismatchException(String message) {
        super(message);
    }
}

public class UserRegistration {
    
    // Method to validate username and password
    public static void registerUser(String username, String password, String confirmPassword) 
            throws InvalidUsernameException, PasswordMismatchException {
        
        // Check if username is less than 6 characters
        if (username.length() < 6) {
            throw new InvalidUsernameException("Username must be at least 6 characters long.");
        }
        
        // Check if password matches confirmPassword
        if (!password.equals(confirmPassword)) {
            throw new PasswordMismatchException("Password and confirmation do not match.");
        }
        
        System.out.println("Registration successful!");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for username and password
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        
        System.out.print("Confirm password: ");
        String confirmPassword = scanner.nextLine();
        
        // Attempt registration and handle exceptions
        try {
            registerUser(username, password, confirmPassword);
        } catch (InvalidUsernameException | PasswordMismatchException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}