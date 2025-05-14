import java.util.*;

public class D_Balanced_Round {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }
            Arrays.sort(arr);
            int x = 1;
            if(n==1){
                System.out.println(0);
                continue;
            }
            int max = Integer.MIN_VALUE;
            for(int i=1;i<n;i++){
                if((arr[i]-arr[i-1])<=k){
                    x++;
                }else{
                    x=1;
                }
                max = Math.max(max, x);
            }
            System.out.println(n-max);
        }

    }
}