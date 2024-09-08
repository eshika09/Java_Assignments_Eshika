import java.util.Scanner;
public class assignment19 {
    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int original_number=sc.nextInt();
        int number=original_number;
        int reversed_number=0;
        while(original_number>0){
         int lastdigit=original_number%10;
         reversed_number=reversed_number*10+lastdigit;
         original_number=original_number/10;
        }
        if(number==reversed_number){
            System.out.println("The number is palindrome");
        }else{
            System.out.println("The number is not a palindrome");
        }

    }
}
