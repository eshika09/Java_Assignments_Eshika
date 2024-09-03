import java.util.Scanner;
public class assignment15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number you want the multiplication table of: ");
        int n=sc.nextInt();
        for(int i=1; i<=10; i++){
            int ans=n*i;
            System.out.println(ans);
        }
    }
}
