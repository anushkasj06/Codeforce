import java.util.*;

public class D_Retaliation {

    public static void solve(Scanner sc) {
        long n = sc.nextLong();
        long[] a = new long[(int)n];

        for (int i = 0; i < n; ++i) {
            a[i] = sc.nextLong();
        }

        long commonDifference = a[1] - a[0];
        for (int i = 2; i < n; ++i) {
            if (a[i] - a[i - 1] != commonDifference) {
                System.out.println("NO");
                return;
            }
        }

        long a0 = a[0];
        long d = commonDifference;
        long denominator = n + 1;

        long yNumerator = a0 - d;
        long xNumerator = a0 + d * n;

        if (yNumerator >= 0 && xNumerator >= 0 && yNumerator % denominator == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
        sc.close();
    }
}
