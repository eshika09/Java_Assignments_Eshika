class vehicle{
    protected String regnNumber;
    protected int speed;
    protected String color;
    protected String ownerName;
    public vehicle(String regnNumber, int speed, String color, String ownerName) {
        this.regnNumber = regnNumber;
        this.speed = speed;
        this.color = color;
        this.ownerName = ownerName;
    }
    public void showData() {
        System.out.println("This is a vehicle class.");
        System.out.println("Registration Number: " + regnNumber);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Color: " + color);
        System.out.println("Owner's Name: " + ownerName);
    }
}
class bus extends vehicle{
    private int routeNumber;
    public bus(String regnNumber, int speed, String color, String ownerName, int routeNumber) {
        super(regnNumber, speed, color, ownerName); 
        this.routeNumber = routeNumber;
    }
    public void showData() {
        super.showData();  
        System.out.println("Bus Route Number: " + routeNumber);
    }
}
class car extends vehicle{
    private String manufacturerName;
    public car(String regnNumber, int speed, String color, String ownerName, String manufacturerName) {
        super(regnNumber, speed, color, ownerName);  
        this.manufacturerName = manufacturerName;
    }
    public void showData() {
        super.showData();  
        System.out.println("Car Manufacturer Name: " + manufacturerName);
    }
}
public class ass2_10 {
    public static void main(String[] args) {
        bus b = new bus("MH12AB1234", 60, "Red", "John Doe", 101);
        System.out.println("Bus Details:");
        b.showData();

        car c = new car("KA01XY6789", 120, "Blue", "Alice Smith", "Toyota");
        System.out.println("\nCar Details:");
        c.showData();
    

    }
}
