package Assignments_1;
import java.util.Scanner;
public class assignment2 {
    public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number: ");
    double number = sc.nextDouble();
    if(number>0){
        System.out.println("Positive number");
    }else if(number<0){
        System.out.println("Negative number");
    }else{
        System.out.println("Entered number is zero");
    }sc.close();
    }
}
