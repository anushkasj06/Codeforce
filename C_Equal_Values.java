import java.util.*;
import java.io.*;

public class C_Equal_Values {
    static void solve(BufferedReader br) throws IOException {
        int n = Integer.parseInt(br.readLine());
        long[] a = new long[n];
        String[] parts = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            a[i] = Long.parseLong(parts[i]);
        }

        long ans = Long.MAX_VALUE;

        for (int i = 0; i < n; ) {
            int j = i;
            while (j + 1 < n && a[j + 1] == a[i]) j++;
            long v = a[i];
            long cost = v * (i + (n - 1 - j));
            ans = Math.min(ans, cost);
            i = j + 1;
        }

        System.out.println(ans);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(br.readLine());
        for (int t = 0; t < tests; t++) {
            solve(br);
        }
    }
}
