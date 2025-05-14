import java.util.*;

public class B_Fair_Numbers{
    public static boolean isFair(long n){
        long x = n;
        while(x>0){
            long digit = x%10;
            if(digit!=0 && n%digit!=0){
                return false;
            }
            x/=10;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            while(!isFair(n)){
                n++;
            }
            System.out.println(n);
        }
    }
}