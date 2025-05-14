import java.util.*;

public class B_Luke_is_a_Foodie {
    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        int x = sc.nextInt();
        
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int l = a[0] - x;
        int r = a[0] + x;
        int changes = 0;

        for (int i = 1; i < n; i++) {
            int l1 = a[i] - x;
            int r1 = a[i] + x;

            if ((l1 >= l && l1 <= r) || (r1 >= l && r1 <= r) || (l >= l1 && l <= r1) || (r >= l1 && r <= r1)) {
                l = Math.max(l, l1);
                r = Math.min(r, r1);
            } else {
                changes++;
                l = l1;
                r = r1;
            }
        }

        System.out.println(changes);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();

        while (testcases-- > 0) {
            solve(sc);
        }
        sc.close();
    }
}
