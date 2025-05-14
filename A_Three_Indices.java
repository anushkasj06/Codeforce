import java.util.*;

public class A_Three_Indices{

    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] p = new int[n+1];
        for (int i = 1; i <= n; i++) {
            p[i] = sc.nextInt();
        }

        int pre_min[] = new int[n+1];
        int pre_idx[] = new int[n+1];
        pre_min[1] = p[1];
        pre_idx[1] = 1;
        for(int i=2;i<=n;i++){
            int min = Math.min(pre_min[i-1], p[i]);
            pre_min[i]  = min;
            if(min == p[i]){
                pre_idx[i] = i;
            }else{
                pre_idx[i] = pre_idx[i-1];
            }
            
        }

        int suf_min[] = new int[n+1];
        int suf_idx[] = new int[n+1];
        suf_min[n] = p[n];
        suf_idx[n] = n;
        for(int i=n-1;i>=1;i--){
            int min = Math.min(suf_min[i+1], p[i]);
            suf_min[i]  = min;
            if(min == p[i]){
                suf_idx[i] = i;
            }else{
                suf_idx[i] = suf_idx[i+1];
            }
        }

        for(int j=2;j<=n-1;j++){
            if(p[j]>pre_min[j-1]&& p[j]>suf_min[j+1]){

                System.out.println("YES");
                System.out.println(pre_idx[j-1] + " " + j + " " + suf_idx[j+1]);
                return;
            }
        }
        System.out.println("NO");

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // number of test cases
        while (t-- > 0) {
            solve(scanner);
        }
    }
}