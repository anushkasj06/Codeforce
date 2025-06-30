import java.util.*;

public class E_Binary_Deque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int s = sc.nextInt();
            int[] arr = new int[n];
            int total = 0;

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                total += arr[i];
            }

            // If not enough 1s, not possible
            if (total < s) {
                System.out.println(-1);
                continue;
            }

            // If exact, no removal needed
            if (total == s) {
                System.out.println(0);
                continue;
            }

            // Find longest subarray with sum s
            int maxLen = 0;
            int sum = 0, left = 0;

            for (int right = 0; right < n; right++) {
                sum += arr[right];

                while (sum > s) {
                    sum -= arr[left++];
                }

                if (sum == s) {
                    maxLen = Math.max(maxLen, right - left + 1);
                }
            }

            System.out.println(n - maxLen); // Minimum removals
        }
    }
}
