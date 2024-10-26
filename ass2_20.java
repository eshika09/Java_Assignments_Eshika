class NoMatchFoundException extends Exception {
    public NoMatchFoundException(String message) {
        super(message);
    }
}

public class ass2_20 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please enter a country name as a command-line argument.");
            return;
        }
        String country = args[0].toLowerCase();
        String capital;

        switch (country) {
            case "united states":
                capital = "Washington, D.C.";
                break;
            case "canada":
                capital = "Ottawa";
                break;
            case "united kingdom":
                capital = "London";
                break;
            case "france":
                capital = "Paris";
                break;
            case "germany":
                capital = "Berlin";
                break;
            case "india":
                capital = "New Delhi";
                break;
            default:
                capital = null; 
        }

        try {
            if (capital == null) {
                throw new NoMatchFoundException("No capital found for the country: " + args[0]);
            }
            System.out.println("The capital of " + args[0] + " is: " + capital);
        } catch (NoMatchFoundException e) {

            System.out.println(e.getMessage());
        }
    }
}