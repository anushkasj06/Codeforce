import java.util.*;

public class C_Combination_Lock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            if (n % 2 == 0) {
                System.out.println(-1);
                continue;
            }

            int[] perm = new int[n];
            for (int i = 1; i <= n; i++) {
                perm[i - 1] = ((2 * (i - 1)) % n) + 1;
            }

            for (int i = 0; i < n; i++) {
                System.out.print(perm[i] + (i + 1 == n ? "\n" : " "));
            }
        }

        sc.close();
    }
}
