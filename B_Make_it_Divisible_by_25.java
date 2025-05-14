import java.util.*;

public class B_Make_it_Divisible_by_25 {
    static long[][] dp = new long[20][25];

    public static long f(int index, int num, String s) {
        if (index == s.length()) {
            return (num % 25 == 0) ? 0 : (int) 1e9;
        }

        if (dp[index][num] != -1) return dp[index][num];

        long deleteDigit = 1 + f(index + 1, num, s);  // skip current digit
        long takeDigit = f(index + 1, (num * 10 + (s.charAt(index) - '0')) % 25, s);  // take current digit

        dp[index][num] = Math.min(deleteDigit, takeDigit);
        return dp[index][num];
    }

    public static void solve(Scanner sc) {
        long n = sc.nextLong();
        String s = Long.toString(n);
        for (long[] row : dp) Arrays.fill(row, -1);
        System.out.println(f(0, 0, s));
    }

    public static void main(String[] args) { // sc.nextInt();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
        solve(sc);
        }
        // sc.close();


    }
}
