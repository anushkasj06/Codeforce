import java.util.*;

public class B_Kill_Demodogs {
    static final long MOD = 1000000007;
    static final long MULTIPLIER = 2022;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long sum = 0;

            for (int i = 1; i < n; i++) {
                sum += (1L * i * i) + (1L * i * (i + 1));
                sum %= MOD;
            }

            sum += 1L * n * n;
            sum %= MOD;

            long result = (sum * MULTIPLIER) % MOD;
            System.out.println(result);
        }

        sc.close();
    }
}
