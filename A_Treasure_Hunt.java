import java.util.*;

public class A_Treasure_Hunt {
    public static void solve(Scanner scanner) {
        long x = scanner.nextLong();
        long y = scanner.nextLong();
        long k = scanner.nextLong();

        if (x > k) {
            System.out.println("NO");
            return;
        }

        long s = x + y;
        long cycle = k / s;
        long remainder = k - (x * cycle + y * cycle);

        if (x > remainder) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            solve(scanner);
        }
    }
}
