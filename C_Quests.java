import java.util.*;

public class C_Quests {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt(); // Number of test cases
        while (t-- > 0) {
            int n = in.nextInt();
            int k = in.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt(); // Read the first array
            }
            for (int i = 0; i < n; i++) {
                b[i] = in.nextInt(); // Read the second array
            }

            int sum =0, maxi=0, ans =0;

            for(int i=0;(n>=k)?(i<k):(i<n);i++){
                sum += a[i];
                maxi = Math.max(maxi, b[i]);
                int c = (k-(i+1));
                ans = Math.max(ans, sum + (maxi * c));
            }
            System.out.println(ans);
        }
        in.close();

    }
}