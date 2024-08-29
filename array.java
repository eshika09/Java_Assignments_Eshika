import java.util.Scanner;
public class array {
     public static void main(String[] args){
        int [] a=new int[5];
        for(int i=0;i<5;i++){
            Scanner sc=new Scanner(System.in);
            a[i]=sc.nextInt();
        }
        System.out.println("the value is " + a[2]);
      //sorting of array
      for(int i=0;i<4;i++){
        for(int j=0;j<5-i-1;j++){
            if(a[j]>a[j+1]){
                int t;
                t=a[j];
                a[j]=a[j+1];
                a[j+1]=t;
            }
}        }
        
        for(int i=0;i<5;i++){
            System.out.print(a[i] + " ");
        }
      }
    }