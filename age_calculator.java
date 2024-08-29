import java.util.Scanner;
public class age_calculator {
    public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    System.out.println("enter your birth year ");
    int year=sc.nextInt();
    int current_year=2024;
    int age=current_year-year;
    System.out.println("your age is " + age );
    }
}