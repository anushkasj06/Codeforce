import java.util.*;

public class A_Buying_Torches{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long x= sc.nextLong();
            long y= sc.nextLong();
            long k= sc.nextLong();
            long trade = k;
            long n = (k*y + k - 1)/ (x-1);
            if((k*y+k-1)%(x-1)!=0){
                n++;
            }
            long ans = n + trade;
            System.out.println(ans);
        }
    }
}