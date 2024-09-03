package Assignments_1;
import java.util.Scanner;
public class assignment11 {
    public static int reverse(int number){
        
        int reverse=0;
        while(number>0){
            int lastdigit=number%10;
         reverse=reverse*10+lastdigit;
         number=number/10;
        }return reverse;
    }
    public static void main(String []args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a number: ");
     int number=sc.nextInt();
     System.out.println("Reversed number is: "+reverse(number));
    }
}

