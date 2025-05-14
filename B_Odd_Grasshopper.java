import java.util.Scanner;

public class B_Odd_Grasshopper {
    public static void solve(Scanner sc) {
        long x = sc.nextLong();
        long n = sc.nextLong();

        long jump = n % 4;
        long tot_jump = (n / 4) * 4 + 1;

        for (long i = 1; i <= jump; i++) {
            if ((x & 1) == 1) {
                x += tot_jump;
            } else {
                x -= tot_jump;
            }
            tot_jump++;
        }

        System.out.println(x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            solve(sc);
        }
    }
}
