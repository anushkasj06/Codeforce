import java.util.*;

public class D_Odd_Queries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-->0) {
            int n = in.nextInt();
            int q = in.nextInt();
            long[] arr = new long[n+1];
            long[] prefix = new long[n + 1];
            long sum = 0;
            for (int i = 1; i <= n; i++) {
                arr[i] = in.nextLong();
                prefix[i] = prefix[i - 1] + arr[i];
                sum += arr[i];
            }

            while (q-->0) {
                int l = in.nextInt();
                int r = in.nextInt();

                long k = in.nextLong();
                long sumtor = (r-l+1)*k;
                long sumlessthanL = prefix[l-1];
                long sumgreaterthanR = sum - prefix[r];
                long total = sumlessthanL + sumgreaterthanR + sumtor;

                if (total % 2 == 0) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                }
            }

        }
    }

}   