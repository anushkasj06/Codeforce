import java.util.*;

public class B_Shrink{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n+1];
            a[1] = 1;
            int k = n;
            for(int  i=2;i<=n;i++){
                a[i] = k;
                k--;
            }
            for(int i = 1; i <= n; i++) {
                System.out.print(a[i]+" ");
            }
            System.out.println();

        }
    }
}