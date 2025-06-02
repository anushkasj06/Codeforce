import java.util.*;

public class F_Eating_Candies {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            int n = in.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }

            HashMap<Integer, Integer> prefixMap = new HashMap<>();
            HashMap<Integer, Integer> suffixMap = new HashMap<>();

            int sum = 0;

            // Prefix sums (from left)
            for (int i = 0; i < n; i++) {
                sum += arr[i];
                // Only store the first occurrence (smallest i)
                prefixMap.putIfAbsent(sum, i + 1);
            }

            sum = 0;

            // Suffix sums (from right)
            for (int i = n - 1; i >= 0; i--) {
                sum += arr[i];
                // Only store the first occurrence (smallest suffix length)
                suffixMap.putIfAbsent(sum, n - i);
            }

            int maxCandies = 0;

            for (int key : prefixMap.keySet()) {
                if (suffixMap.containsKey(key)) {
                    int left = prefixMap.get(key);
                    int right = suffixMap.get(key);
                    if (left + right <= n) {
                        maxCandies = Math.max(maxCandies, left + right);
                    }
                }
            }

            System.out.println(maxCandies);
        }
    }
}
