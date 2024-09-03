package Assignments_1;
import java.util.Scanner;
public class assignment9 {public static int factorial(int x){
    int fact=1;
    for(int i=1; i<=x; i++){
        fact=fact*i;
    }return fact;
}
    public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number you want the factorial of: ");
     int num=sc.nextInt();
     System.out.println("Factorial of the number is: "+factorial(num));
    }
}
