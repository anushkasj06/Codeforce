import java.util.*;

public class B_Shrinking_Array{
    public static void solve(Scanner sc) {
    int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        boolean isBeautiful = false;

        
        for (int i = 0; i < n - 1; i++) {
            if (Math.abs(a[i] - a[i + 1]) <= 1) {
                isBeautiful = true;
                break;
            }
        }

        if (isBeautiful) {
            System.out.println(0);
        } else if (n == 2) { 
            System.out.println(-1);
        } else {
            System.out.println(1); 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
        sc.close();
    }
}