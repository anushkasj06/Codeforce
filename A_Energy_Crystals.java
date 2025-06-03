import java.util.*;

public class A_Energy_Crystals{
    public static void solve(long x) {
        int k = 63 - Long.numberOfLeadingZeros(x);
        long ans = 2L * k + 3;
        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tests = scanner.nextInt();
        while (tests-- > 0) {
            long x = scanner.nextLong();
            solve(x);
        }
    }
}