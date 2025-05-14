import java.util.*;

public class B_Bobritto_Bandito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases

        while (t-- > 0) {
            int n = sc.nextInt(); // Total number of days
            int m = sc.nextInt(); // Day to simulate
            int l = sc.nextInt(); // Final left boundary after n days
            int r = sc.nextInt(); // Final right boundary after n days

            int leftNeeded = -l;

            // Number of left moves we can do on day m
            int leftMoves = Math.min(m, leftNeeded);
            int rightMoves = m - leftMoves;

            int lPrime = -leftMoves;
            int rPrime = rightMoves;

            System.out.println(lPrime + " " + rPrime);
        }
    }
}
