import java.util.Scanner;
public class assignment13 {
    public static int sum(int n){
        if(n==1)return 1;
        return sum(n-1)+n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number till where you want to calculate the sum: ");
        int n=sc.nextInt();
         System.out.println("The sum is: "+sum(n));
    }
}
