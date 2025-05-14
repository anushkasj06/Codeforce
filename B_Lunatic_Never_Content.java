import java.util.*;

public class B_Lunatic_Never_Content{
    static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            boolean ispalindromic = true;
            for(int i=0;i<(n+1)/2;i++){
                if(a[i] != a[n-i-1]){
                    ispalindromic = false;
                    break;
                }
            }
            if(ispalindromic){
                System.out.println(0);;
            }else{
                int gap = Math.abs(a[0]-a[n-1]);
                for(int i=0;i<(n+1)/2;i++){
                    gap = gcd(gap, Math.abs(a[i]-a[n-i-1]));
                }
                System.out.println(gap);
            }
        }
    }
}