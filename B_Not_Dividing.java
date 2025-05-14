import java.util.*;

public class B_Not_Dividing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();  // number of test cases
        while (t-- > 0) {
            int n = in.nextInt();
            long[] arr = new long[n];

            for (int i = 0; i < n; i++) {
                arr[i] = in.nextLong();
                if(arr[i]==1){
                    arr[i]++;
                }
            }
            
            for (int i = 1; i < n; i++) {
                // While arr[i] is divisible by arr[i-1], increment arr[i]
                while (arr[i] % arr[i - 1] == 0) {
                    arr[i]++;
                }
            }

            // Print the modified array
            for (long num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
