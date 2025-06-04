import java.util.*;

public class G_2_Subsequence_Addition_Hard_Version{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] v = new int[n];
            for(int i=0;i<n;i++){
                v[i] = sc.nextInt();
            }
            int ans =0;
            int i=n-1;
            while(i>=0 && v[i]==v[n-1]){
                i--;
            }
            if(i==-1){
                System.out.println(0);
                continue;
            }
            while(i>=0){
                i -=(n-1-i);
                ans++;
                while(i>=0 && v[i]==v[n-1]){
                    i--;
                }
            }
            System.out.println(ans);
        }
    }
}