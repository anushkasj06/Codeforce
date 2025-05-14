import java.util.*;

public class M_Minimum_LCM {

    public static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static long lcm(long a, long b) {
        return Math.abs((a * b) / gcd(a, b));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long LCM = Integer.MAX_VALUE;
            long first=1;
            long second=n-1;
            for(int d=2;(d*d)<=n;d++){
                if(n%d==0){
                    long a = d;
                    long b = n-a;
                    long lcm_val = lcm(a,b);
                    if(lcm_val<LCM){
                        LCM = lcm_val;
                        first = a;
                        second = b;
                    }
                    long a1 = n/d;
                    long b1 = n-a1;
                    long lcm_val1 = lcm(a1,b1);
                    if(lcm_val1<LCM){
                        LCM = lcm_val1;
                        first = a1;
                        second = b1;
                    }
                }
            }
            System.out.println(first+" "+second);
        }
        sc.close();
    }
}
