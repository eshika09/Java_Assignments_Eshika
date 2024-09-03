package Assignments_1;
import java.util.Scanner;
public class assignment10 {public static int fibonacci(int n){
    if(n==1||n==2){
        return 1;
    }return fibonacci(n-1)+fibonacci(n-2);
}
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int n=sc.nextInt();
    System.out.println("Fibonacci is: "+fibonacci(n));
    }
}
