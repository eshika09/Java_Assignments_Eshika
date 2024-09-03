import java.util.Scanner;
public class assignment14 {
    public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a number: ");
     int n=sc.nextInt();
     for(int i=1; i<=n; i++){
        int ans=10*i;
        System.out.println(ans);
     }
    }
}
