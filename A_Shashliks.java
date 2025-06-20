import java.util.*;

public class A_Shashliks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases

        while (t-- > 0) {
            long k = sc.nextLong(); // initial temperature
            long a = sc.nextLong(); // min temp for type 1
            long b = sc.nextLong(); // min temp for type 2
            long x = sc.nextLong(); // temp drop after type 1
            long y = sc.nextLong(); // temp drop after type 2

            // Try both cooking orders
            long ans1 = getMaxPortions(k, a, x, b, y); // Type 1 first
            long ans2 = getMaxPortions(k, b, y, a, x); // Type 2 first

            System.out.println(Math.max(ans1, ans2));
        }

        sc.close();
    }

    // Cook type1 first, then type2 (type1: a1, x1; type2: a2, x2)
    static long getMaxPortions(long k, long a1, long x1, long a2, long x2) {
        if (k < Math.min(a1, a2)) return 0;

        // Cook type1 max times
        long max1 = 0;
        if (k >= a1) {
            max1 = ((k - a1) / x1) + 1;
            k -= max1 * x1;
        }

        long max2 = 0;
        if (k >= a2) {
            max2 = ((k - a2) / x2) + 1;
        }

        return max1 + max2;
    }
}
