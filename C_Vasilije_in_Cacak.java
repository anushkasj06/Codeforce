import java.util.*;

public class C_Vasilije_in_Cacak{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextInt();
            long k = sc.nextInt();
            long x = sc.nextLong();
            long minsum = k*(k+1)/2;
            long maxsum = k*(2*n-k+1)/2;
            if(x>=minsum && x<=maxsum){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}