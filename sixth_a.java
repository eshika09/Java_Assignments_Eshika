import java.util.Scanner;
public class sixth_a {
    public static int factorial(int n){
        int result=1;
        for(int i=1; i<=n; i++){
            result=result*i;
        }return result;
    }
    public static void main(String [] args){
        int n=5;
        int ans=factorial(n);  
        System.out.println("Factorial of 5 is: " +ans);
    }
}
