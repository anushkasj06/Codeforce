import java.util.*;

public class B_JoJo_s_Incredible_Adventures{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            String str = sc.next();
            int n = str.length();
            int mx = 0, cnt = 0;
            boolean flg = true;
            int s = 0;

            for (int i = 0; i < n; i++) {
                if (str.charAt(i) == '1') {
                    cnt++;
                } else {
                    if (flg) {
                        flg = false;
                        s = cnt;
                    }
                    mx = Math.max(mx, cnt);
                    cnt = 0;
                }
            }

            mx = Math.max(mx, cnt);
            int e = cnt;
            mx = Math.max(mx, s + e);

            if (flg) {
                System.out.println((long)n * n);
            } else {
                int r = (mx - 1) / 2;
                long ans = (long)(mx - r) * (r + 1);
                System.out.println(ans);
            }
        }

        sc.close();
    }
}
