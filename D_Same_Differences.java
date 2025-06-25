import java.util.*;

public class D_Same_Differences {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();  // Number of test cases

        while (t-- > 0) {
            int n = sc.nextInt();  // Size of the array
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                arr[i] -= i;  // Transform: a[i] = a[i] - i
            }

            // Map to store frequency of each transformed value
            Map<Integer, Long> freq = new HashMap<>();

            for (int val : arr) {
                freq.put(val, freq.getOrDefault(val, 0L) + 1);
            }

            long ans = 0;

            for (long count : freq.values()) {
                ans += (count * (count - 1)) / 2;  // nC2
            }

            System.out.println(ans);
        }

        sc.close();
        
    }
}