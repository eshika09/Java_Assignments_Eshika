import java.util.Scanner;
public class assignment20 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number(greater than or equal to 2): ");
        int num=sc.nextInt();
        
        for(int i=2; i*i<=(num); i++){
              if(num%i==0){
                System.out.println("Not a prime number");
                
              }
        }System.out.println("is a prime number");
    }
}
