import java.util.*;

public class B_Longest_Divisors_Interval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long i=1;
            while(n%i==0){
                i++;
            }
            System.out.println(i-1);
        }
    }
}