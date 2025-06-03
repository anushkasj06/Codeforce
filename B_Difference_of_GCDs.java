import java.util.*;

public class B_Difference_of_GCDs {

    static void solve(Scanner sc) {
        long n = sc.nextLong();
        long l = sc.nextLong();
        long r = sc.nextLong();

        List<Long> ans = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            long temp = ((l + i - 1) / i) * i;
            ans.add(temp);
            if (temp > r) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
        for (long num : ans) {
            System.out.print(num + " ");
        }
        System.out.println();
        // T.C :- O(n)
        // S.C :- O(n)
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = 1;
        t = sc.nextInt();
        
        while (t-- > 0) {
            solve(sc);
        }

        sc.close();
    }
}
