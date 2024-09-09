import java.util.Scanner;
public class assignment21 {
    public static void main(String[]args){
        //Conversion of binary to decimal
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a binary number: ");
        int bn=sc.nextInt();
        int ans=0; int power=1;
        while(bn>0){
            int lastdigit=bn%10;
            ans=ans+(lastdigit*power);
            power=power*2;
            bn=bn/10;
        }System.out.println("The given binary number in the decimal form is: "+ans);
         //Conversion of decimal to binary
         System.out.println("Enter a decimal number: ");
         int dn=sc.nextInt();
         int result=0; int exp=1;
         while(dn>0){
            int paritydigit=dn%2;
            result=result+paritydigit*exp;
            exp=exp*10;
            dn=dn/2;
         }
         System.out.println("Conversion of decimal number into binary is: "+result);
        
    }
}
