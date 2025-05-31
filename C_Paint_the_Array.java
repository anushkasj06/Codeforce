import java.util.*;

public class C_Paint_the_Array{
    public static long gcd(long a,long b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
    public static void solve(Scanner sc){
        int n = sc.nextInt();
            long[] a = new long[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextLong();
            }
            long gcd1=0;
            long gcd2=0;
            for(int i=0;i<n-2;i+=2){
                gcd1 = gcd(gcd1,a[i]);
                gcd2 = gcd(gcd2,a[i+1]);
            }
            boolean found1 = false;
            boolean found2 = false;
            for(int i=0;i<n-2;i+=2){
               if(a[i]%gcd2==0){
                   found1 = true;
               }
               if(a[i+1]%gcd1==0){
                   found2 = true;
               }
            
            }
            if(!found1){
                System.out.println(gcd1);
            }
            else if(!found2){
                System.out.println(gcd2);
            }else{
                System.out.println(0);
            }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            solve(sc);
            
        }
    }
}