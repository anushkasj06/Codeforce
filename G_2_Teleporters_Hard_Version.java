import java.util.*;

public class G_2_Teleporters_Hard_Version {

    public static void solve(Scanner sc) {
        long n = sc.nextLong();
        long[] v = new long[(int) n];

        for (int i = 0; i < n; i++) {
            v[i] = sc.nextLong();
        }

        Arrays.sort(v);

        if (v[0] != 1) {
            System.out.println("No");
            return;
        }

        long sum = 1;
        for (int i = 1; i < n; i++) {
            if (v[i] > sum) {
                System.out.println("No");
                return;
            }
            sum += v[i];
        }

        System.out.println("Yes");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 1;
        t = sc.nextInt();

        while (t-- > 0) {
            solve(sc);
        }
    }
}
