import java.util.*;

public class B_Maximum_Sum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            long[] a = new long[n];
            long sum =0;
            for(int i=0;i<n;i++){
                a[i] = sc.nextLong();
                sum += a[i];
            }
            Arrays.sort(a);
            int m = k;
            int i=0;
            while(m-->0){
                sum -= (a[i]+a[i+1]);
                i+=2;
            }
            long ans = sum;
            int j = n-1;
            i-=2;
            while(i>=0){
                sum+=(a[i]+a[i+1]);
                sum-=a[j];
                ans = Math.max(ans, sum);
                i-=2;
                j--;
                
            }
            System.out.println(ans);
        
        }
    }
}