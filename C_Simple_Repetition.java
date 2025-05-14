import java.util.*;

public class C_Simple_Repetition{
    public static boolean isprime(long n){
        if(n<2){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        while(t-->0){
            long x = in.nextLong();
            int k = in.nextInt();
            System.out.println((k==1?(isprime(x) ?"YES":"NO"):((x==1 && k==2)?"YES":"NO")));
        }
    }
}