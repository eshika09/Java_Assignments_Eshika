import java.util.Scanner;
public class matrixmultiplication {
    public static void main(String[] args){
        int [][] a = new int [3][3];
        int [][]b= new int[3][3];
        for(int i=0;i<3;i++){
            for( int j=0;j<3;j++){
               Scanner sc=new Scanner(System.in);
               System.out.println("enter the values of 1st matrix: ");
               a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<3;i++){
            for( int j=0;j<3;j++){
               Scanner sc=new Scanner(System.in);
               System.out.println("enter the values of 2nd matrix: ");
               b[i][j]=sc.nextInt();
            }
        }
        int [][]result=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                result[i][j]=0;
                for(int k=0;k<3;k++){
                    result[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
            System.out.print(result[i][j] + " ");
        }System.out.println();
    }

        
    }
}
