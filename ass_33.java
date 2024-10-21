import java.util.Scanner;

class Commission {
    double sales;  
    Commission(double sales) {
        this.sales = sales;
    }

    
    double commission() {
        return sales * 0.10;
    }
}


public class ass_33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the sales amount: ");
        double sales = sc.nextDouble();

        
        if (sales < 0) {
            System.out.println("Invalid Input");
        } else {
            
            Commission commissionObj = new Commission(sales);
            double commission = commissionObj.commission();

            
            System.out.println("The commission is: " + commission);
        }


    }
}
