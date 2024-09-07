import java.util.Scanner;
public class assignment17 {
   public static int hcf(int a, int b){
        if(b>a)return hcf(b, a);
        if(b==0)return a;
        return hcf(b, a%b);
    }
    public static int lcm(int a, int b){
        return a*b/hcf(a, b);
    }
   public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a: ");
    int a=sc.nextInt();
    System.out.println("Enter b: ");
    int b=sc.nextInt();
    System.out.println("LCM of a and b is: " +lcm(a, b));
    
   } 
}
