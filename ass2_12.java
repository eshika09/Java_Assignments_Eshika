class Distance {
    protected double distanceInMiles;

    
    public Distance(double distanceInMiles) {
        this.distanceInMiles = distanceInMiles;
    }


    public void travelTime() {
        double speedInMilesPerHour = 60;
        double timeInHours = distanceInMiles / speedInMilesPerHour; 
        System.out.printf("Time taken to travel %.2f miles at %.2f mph: %.2f hours%n", 
                          distanceInMiles, speedInMilesPerHour, timeInHours);
    }
}
class DistanceMKS extends Distance {
    
    public DistanceMKS(double distanceInKilometers) {
        
        super(distanceInKilometers * 0.621371); 
    }

    
    @Override
    public void travelTime() {
        double speedInKmPerSecond = 100; 
        double timeInSeconds = (distanceInMiles / 0.621371) / speedInKmPerSecond; 
        System.out.printf("Time taken to travel %.2f kilometers at %.2f km/s: %.2f seconds%n", 
                          distanceInMiles / 0.621371, speedInKmPerSecond, timeInSeconds);
    }
}

public class ass2_12 {
    public static void main(String[] args) {
        Distance distanceInMiles = new Distance(120);
        System.out.println("Calculating travel time for distance in miles:");
        distanceInMiles.travelTime();

        
        DistanceMKS distanceInKilometers = new DistanceMKS(120); 
        System.out.println("\nCalculating travel time for distance in kilometers:");
        distanceInKilometers.travelTime();
    }
}
