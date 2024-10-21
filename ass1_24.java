import java.util.Scanner;
public class ass1_24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements in the array: ");
        int n=sc.nextInt();
        int []arr=new int[n];
        double sum=0;
        System.out.println("Enter elements of array: ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        double avg= sum/n;
        System.out.println("Sum is: "+sum);
        System.out.println("Average is: "+avg);

    }
}
