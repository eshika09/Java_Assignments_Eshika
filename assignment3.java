package Assignments_1;
import java.util.Scanner;
public class assignment3 {
    public static void main(String []args){
    Scanner sc=new Scanner(System.in); 
    System.out.println("Enter a: ");
    double a=sc.nextDouble();
    System.out.println("Enter b: ");
    double b=sc.nextDouble();
    System.out.println("Enter c: ");
    double c=sc.nextDouble();
    if(a>b&&a>c){
        System.out.println("Maximum element is: " +a);
    }else if(b>a&&b>c){
        System.out.println("Maximum element is: " +b);
    }else{
        System.out.println("Maximum element is: "+c);
    }sc.close();
    
    }
}
