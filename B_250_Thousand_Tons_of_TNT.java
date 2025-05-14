import java.util.*;

public class B_250_Thousand_Tons_of_TNT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            long[] a = new long[(int)n+1];
            long[] prefix = new long[(int)n+1];
            a[0] = 0;
            prefix[0] = 0;
            for(int i = 1; i <= n; i++){
                a[i] = sc.nextLong();
                prefix[i] = prefix[i-1] + a[i];
            }
            long ans =0;
            for(int k =1; k<=n;k++){
                long max = Long.MIN_VALUE;
                long min = Long.MAX_VALUE;
                if(n%k==0){
                    for(int j=k;j<=n;j+=k){
                        max = Math.max(max, prefix[j] - prefix[j-k]);
                        min = Math.min(min, prefix[j] - prefix[j-k]);
                    }
                    ans = Math.max(ans, max - min);
                }
            }
            System.out.println(ans);

        }
    }
}