package Assignments_1;
import java.util.Scanner;
public class assignment1 {
    public static double c_to_f(double celsius){
        return (1.8*celsius)+32;//converts celsius to fahrenheit
    }
    public static double f_to_c(double fahrenheit){
        return (fahrenheit-32)*0.555;//converts fahrenheit to celsius
    }
    public static void main(String []args){
     System.out.println(c_to_f(17.5));
     System.out.println(f_to_c(23.4));

    }
}
