import java.util.Scanner;
public class ass1_29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        boolean[] visited = new boolean[n];

        
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            visited[i] = false;  
        }

        
        boolean foundDuplicate = false;  
        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                continue; 
            }

            int count = 1;  
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++; 
                    visited[j] = true;
                }
            }
            if (count > 1) {
                System.out.println("Element: " + arr[i] + " Frequency: " + count);
                foundDuplicate = true;
            }
        }

        
    }
}
