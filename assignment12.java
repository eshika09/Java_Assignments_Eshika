package Assignments_1;
import java.util.Scanner;
public class assignment12 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks in Maths: ");
        double maths=sc.nextDouble();
        System.out.println("Enter physics marks: ");
        double physics=sc.nextDouble();
        System.out.println("Enter chemistry marks: ");
        double chem=sc.nextDouble();
        if((maths>=60&&physics>=50&&chem>=40&&(physics+maths+chem)>=200)||(maths+physics)>=150){
            System.out.println("Eligible candidate");
        }else{
            System.out.println("Not eligible candidate");
        }
    }
}
