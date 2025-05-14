import java.util.*;

public class D_Black_and_White_Stripe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();

            int b = 0, w = 0;

            // Count initial window
            for (int i = 0; i < k; i++) {
                if (s.charAt(i) == 'B') {
                    b++;
                } else {
                    w++;
                }
            }

            int ans = w;

            // Sliding window
            for (int i = 0; i + k < n; i++) {
                if (s.charAt(i) == 'B') {
                    b--;
                } else {
                    w--;
                }

                if (s.charAt(i + k) == 'B') {
                    b++;
                } else {
                    w++;
                }

                ans = Math.min(ans, w);
            }

            System.out.println(ans);
        }
        sc.close();
    }
}
