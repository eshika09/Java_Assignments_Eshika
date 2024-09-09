import java.util.Arrays;
import java.util.Scanner;
public class assignment22 {
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of elements you want to find the median of: ");
    int n=sc.nextInt();
    int []arr=new int [n];
    System.out.println("Enter the elements in the array: ");
    for(int i=0; i<n; i++){
        arr[i]=sc.nextInt();
    }
    //sort the array
    Arrays.sort(arr);
    int median;
    if(n%2!=0){
        //if arr contains odd number of elements
         median=arr[n/2];
    }else{
        median=(arr[(n/2)-1]+arr[(n/2)])/2; 
    }
    System.out.println("Median of all the numbers is: "+median);
    }
}
