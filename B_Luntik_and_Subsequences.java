import java.util.Scanner;

public class B_Luntik_and_Subsequences {

    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        long cnt1 = 0, cnt0 = 0;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x == 1) cnt1++;
            if (x == 0) cnt0++;
        }

        long ans = cnt1 * (1L <<cnt0); // 111L ensures 111 is treated as a long literal
        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // Read the number of test cases

        while (T-- > 0) {
            solve(sc);
        }
    }
}
