import java.util.*;

public class B_GCD_Partition{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long arr[] = new long[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextLong();
            }

            long total_sum = 0;
            for(int i=0;i<n;i++){
                total_sum += arr[i];
            }

            long ans = 0;
            long sum =0;
            for(int i=0;i<n-1;i++){
                sum += arr[i];
                ans = Math.max(ans,gcd(sum,total_sum-sum));
            }
            System.out.println(ans);
            
        }
    }

    public static long gcd (long a, long b){
        if(b==0){
            return a;
        }else{
            return gcd(b,a%b);
        }
    }
}