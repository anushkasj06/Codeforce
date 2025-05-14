import java.util.*;

public class A_Counting_Orders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases
        while (t-- > 0) {
            int n = sc.nextInt();
        long ans = 1;
        long mod = 1000000007;

        Long[] a = new Long[n];
        Long[] b = new Long[n];
        Long[] res = new Long[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        for (int i = 0; i < n; i++) {
            b[i] = sc.nextLong();
        }

        Arrays.sort(a);
        Arrays.sort(b);

        for (int i = 0; i < n; i++) {
            int idx = upperBound(a, b[i]);
            res[i] = (long) (n - idx);  // Number of elements greater than b[i]
        }

        Arrays.sort(res);
        for (int i = 0; i < n; i++) {
            long value = res[i] - i;
            if (value <= 0) {
                ans = 0;
                break;
            }
            ans = (ans * (value % mod)) % mod;
        }

        System.out.println(ans);
        }
        sc.close();
    }

    // Custom upper_bound: first index where a[i] > key
    public static int upperBound(Long[] arr, long key) {
        int low = 0, high = arr.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] <= key) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}
