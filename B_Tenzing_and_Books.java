import java.util.*;

public class B_Tenzing_and_Books {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            long x = in.nextLong();
            long[] a = new long[n];
            long k = 0;

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < n; j++) {
                    a[j] = in.nextLong();
                }
                for (int j = 0; j < n; j++) {
                    if ((x | a[j]) != x) {
                        break;
                    }
                    k = k | a[j];
                }
            }

            if (k == x) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
