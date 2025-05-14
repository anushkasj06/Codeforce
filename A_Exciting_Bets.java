import java.util.*;

public class A_Exciting_Bets{

    public static void solve(Scanner in) {
        long a = in.nextLong();
        long b = in.nextLong();

        if(a==b){
            System.out.println("0 0");
            return;
        }
        
        long exitment = Math.abs(a-b);
        long g = Math.abs(a-b);
        long turn = Math.min(b%g,g-b%g);
        System.out.println(exitment+" "+turn);

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            solve(in);
        }
    }
}