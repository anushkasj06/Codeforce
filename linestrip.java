import java.util.Scanner;

public class linestrip {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            int k = in.nextInt();
            int[] arr = new int[n];

            for(int i=0; i<n;i++){
                arr[i] = in.nextInt();
            }

            int last =0;
            int ans = Integer.MIN_VALUE;

            for(int i=0; i<n;i++){
                ans = Math.max(ans, arr[i]-last);
                last = arr[i];
            }

            ans = Math.max(ans, 2*(k-last));
            System.out.println(ans);
        }
    }
}
