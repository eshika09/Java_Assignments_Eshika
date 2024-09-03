package Assignments_1;
import java.util.Scanner;
public class assignment5 {
    public static double mile_to_km(double mile){
        return mile*1.60934;//since 1 mile=1.60934 km
    }
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the value of miles that you want to convert into km: ");
        double mile=sc.nextDouble();
        System.out.println("Converted value of miles into km is: "+mile_to_km(mile));
    }
}
