import java.util.*;

public class D_Plus_Minus_Permutation{
    static long sum(long n) {
        return (n * (n + 1)) / 2;
    }

    // Function to calculate GCD using Euclidean algorithm
    static long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    // Function to calculate LCM using GCD
    static long lcm(long a, long b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // number of test cases

        while (t-- > 0) {
            long n = sc.nextLong();
            long x = sc.nextLong();
            long y = sc.nextLong();

            long a = n / x;
            long b = n / y;
            long lcm = lcm(x, y);
            long c = n / lcm;

            long a1 = a - c;
            long b1 = b - c;

            long result = (sum(n) - sum(n - a1)) - sum(b1);
            System.out.println(result);
        }

        sc.close();
    }
}