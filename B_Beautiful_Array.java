import java.util.*;

public class B_Beautiful_Array {
    public static void solve(Scanner sc) {
        if (!sc.hasNextLong()) return; // Prevents reading when input is unavailable

        long n = sc.nextLong();
        long k = sc.nextLong();
        long b = sc.nextLong();
        long s = sc.nextLong();

        if (s < k * b || s > k * b + (n - 1) * (k - 1)) {
            System.out.println("-1");
            return;
        }

        long[] a = new long[(int) n];
        a[0] = k * b;
        s -= k * b;

        for (int i = 1; i < n; i++) {
            long x = Math.min(k - 1, s);
            a[i] += x;
            s -= x;
        }

        for (long num : a) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) {
            sc.close();
            return;
        }

        int t = sc.nextInt(); // Read number of test cases
        while (t-- > 0) {
            solve(sc);
        }

        sc.close(); // Close Scanner to avoid memory leaks
    }
}
