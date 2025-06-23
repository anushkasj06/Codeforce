import java.util.*;

public class C_Coloring_Game{
    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        long count = 0;

            
            for (int ai = 2; ai < n; ai++) {
                int T = Math.max(a[ai], a[n - 1] - a[ai]);

                int l = 0, r = ai - 1;
                while (l < r) {
                    if (a[l] + a[r] > T) {
                        count += (r - l);
                        r--;
                    } else {
                        l++;
                    }
                }
            }

            System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); 

        while (t-- > 0) {
            solve(sc);
        }
    }


}