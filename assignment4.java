package Assignments_1;
import java.util.Scanner;
public class assignment4 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number: ");
        double number1=sc.nextDouble();
        System.out.println("Enter second number: ");
        double number2=sc.nextDouble();
        double temp=number1;
        number1=number2;
        number2=temp;
        System.out.println("Swapped value of number1: "+number1);//prints value of number 2
        System.out.println("Swapped value of number2: "+number2);//prints value of number 1
    }
}
