import java.util.Scanner;
public class ass1_27 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter n: ");
      int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }  
        int smallest =arr[0];
        for(int i=0; i<n; i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        System.out.println("Smallest integer is: "+smallest);
    }
}
