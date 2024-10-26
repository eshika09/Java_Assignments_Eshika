import java.util.Scanner;
class employee{
int empid;
String empname;
double basicsalary;
double grosssalary;
public void acceptdetails(){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter employee id: ");
    empid=sc.nextInt();
    System.out.print("Enter employee name: ");
    empname=sc.next();
    System.out.println("Enter basic salary: ");
    basicsalary=sc.nextDouble();
    double allowances=basicsalary*0.20;
    grosssalary=allowances+basicsalary;
}
public void display_GrossSalary(){
    System.out.println("Gross salary is: "+grosssalary);
}
}
public class ass2_14 {
    public static void main(String[] args) {
        employee e1=new employee();
        e1.acceptdetails();
        e1.display_GrossSalary();
    }
}
