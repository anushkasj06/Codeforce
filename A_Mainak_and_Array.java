import java.util.*;

public class A_Mainak_and_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }

            int ans = Integer.MIN_VALUE;

            // Case 1: arr[n-1] - arr[0] (rotation can bring last before first)
            ans = Math.max(ans, arr[n-1] - arr[0]);

            // Case 2: arr[i] - arr[0], i = 1 to n-1
            for(int i = 1; i < n; i++){
                ans = Math.max(ans, arr[i] - arr[0]);
            }

            // Case 3: arr[n-1] - arr[i], i = 0 to n-2
            for(int i = 0; i < n - 1; i++){
                ans = Math.max(ans, arr[n-1] - arr[i]);
            }

            // Case 4: Check adjacent differences
            for(int i = 1; i < n; i++){
                ans = Math.max(ans, arr[i-1] - arr[i]);
            }

            System.out.println(ans);
        }
    }
}
