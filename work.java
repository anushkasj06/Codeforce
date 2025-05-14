import java.util.*;

public class work{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long mod = 1000000007;
            long[] a = new long[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextLong();
            }
            long[] b= new long[n];
            for(int i = 0; i < n; i++){
                b[i] = sc.nextLong()
            }
            long ans =1;
            long[] res = new long[n];
            Arrays.sort(a);
            Arrays.sort(b);
            int j=0;
            for(int i=0;i<n;i++){
                while(a[j]<=b[i] && j!=n){
                    j++;
                }
                if(j!=n){
                    res[i] = n-j;
                }
            }
            Arrays.sort(res);
            for(int i=0;i<res.length;i++){
                ans = ((ans%mod)*(res[i]%mod))%mod;
            }
            System.out.println(ans);
        }
    }
}