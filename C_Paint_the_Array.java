import java.util.*;

public class C_Paint_the_Array {
    public static long gcd(long a, long b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        // Compute GCD of even indices
        long g1 = a[0];
        for (int i = 2; i < n; i += 2) {
            g1 = gcd(g1, a[i]);
        }

        // Check if g1 is not a divisor of any odd index elements
        boolean ok1 = true;
        for (int i = 1; i < n; i += 2) {
            if (a[i] % g1 == 0) {
                ok1 = false;
                break;
            }
        }

        if (ok1) {
            System.out.println(g1);
            return;
        }

        // Compute GCD of odd indices
        long g2 = a[1];
        for (int i = 3; i < n; i += 2) {
            g2 = gcd(g2, a[i]);
        }

        // Check if g2 is not a divisor of any even index elements
        boolean ok2 = true;
        for (int i = 0; i < n; i += 2) {
            if (a[i] % g2 == 0) {
                ok2 = false;
                break;
            }
        }

        if (ok2) {
            System.out.println(g2);
        } else {
            System.out.println(0);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }
}
