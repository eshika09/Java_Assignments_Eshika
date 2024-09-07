import java.util.Scanner;
public class assignment18 {
    public static int count_digits(int n){
        int count=0;
        while(n>0){
            int lastdigit=n%10;
            count++;
            n=n/10;
        }return count;
    }
    public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a number: ");
     int n=sc.nextInt();
     System.out.println("Number of digits in the number is: "+count_digits(n));
     
    }
}
