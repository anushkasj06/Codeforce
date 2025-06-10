import java.util.*;
import java.io.*;

public class D_Plus_Minus_Permutations {

    static long sum(long n1) {
        return (n1 * (n1 + 1)) / 2;
    }

    public static void main(String[] args) throws IOException {
        // For fast I/O
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long n = Long.parseLong(st.nextToken());
            long x = Long.parseLong(st.nextToken());
            long y = Long.parseLong(st.nextToken());

            long a = n / x;
            long b = n / y;
            long lcm = lcm(x, y);
            long c = n / lcm;

            long a1 = a - c;
            long b1 = b - c;

            long result = (sum(n) - sum(n - a1)) - sum(b1);
            out.println(result);
        }

        out.flush();
        out.close();
        br.close();
    }

    static long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    static long lcm(long a, long b) {
        return (a * b) / gcd(a, b);
    }
}
