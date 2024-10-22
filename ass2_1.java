public class ass2_1 {
    public static void main(String[] args) {
        int[] A={1, 3, 5, 7};
        int[] B={2, 4, 6, 8};
        int[] C=mergeSortedArrays(A, B);
        System.out.println("Merged array: ");
        for(int i=0; i<C.length; i++){
            System.out.print(C[i]+" ");
        }

    }
    public static int[] mergeSortedArrays(int[] A, int[] B){
        int n=A.length;
        int m=B.length;
        int[] c=new int[n+m];
        int i=0, j=0, k=0;
        while(i<n&&j<m){
            if(A[i]<B[j]){
                c[k++]=A[i++];
            }else{
                c[k++]=B[j++];
            }
        }while(i<n){
            c[k++]=A[i++];
        }
        while(j<m){
            c[k++]=B[j++];
        }return c;
    }
}
