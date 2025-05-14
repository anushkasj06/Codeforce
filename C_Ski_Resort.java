import java.util.*;

public class C_Ski_Resort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int q = sc.nextInt();
            int[] a = new int[n];

            for(int i=0;i<n;i++){
                int x = sc.nextInt();
                if(x>q){
                    a[i] = 0;
                }else{
                    a[i] = 1;
                }
            }

            int len =0;
            long ans =0;
            for(int i=0;i<n;i++){
                if(a[i]==1){
                    len++;
                }else{
                    if(len>=k){
                        int m = (len-k+1);
                        ans+=(long) ((m)*(m+1))/2;
                    }
                    len =0;
                    
                }
            }

            if(len>=k){
                int m = (len-k+1);
                ans += (long)((m)*(m+1))/2;
            }
            System.out.println(ans);
        }
    }
}