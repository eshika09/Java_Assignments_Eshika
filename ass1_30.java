import java.util.Scanner;
public class ass1_30 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<n;i++){
            if(i%2==0){
                System.out.println(arr[i]);
            }
        }
    }
}
