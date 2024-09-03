package Assignments_1;
import java.util.Scanner;
public class assignment8 {
    public static boolean check(double number1, double number2){
        //to check if number1 is divisible by number2
        if(number1%number2==0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number1: ");
        double number1=sc.nextDouble();
        System.out.println("Enter number2: ");
        double number2=sc.nextDouble();
        System.out.println(check(number1, number2));
    }
}
