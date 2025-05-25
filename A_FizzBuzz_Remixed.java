import java.util.*;

public class A_FizzBuzz_Remixed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0){
            int  n = scanner.nextInt();
            int ans = (n/15)*3 + (Math.min(n%15+1, 3));
            System.out.println(ans);

        }
    }

    
}