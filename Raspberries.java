import java.util.*;

public class Raspberries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int d = k - 1;
            int even = 0;

            for (int i = 0; i < n; i++) {
                if (arr[i] % 2 == 0) {
                    even++;
                }

                // Check if the number is already divisible by k
                if (arr[i] % k == 0) {
                    d = 0;
                } else {
                    d = Math.min(d, k - arr[i] % k);
                }
            }

            // Special handling when k == 4
            if (k != 4) {
                System.out.println(d);
            } else {
                if (even >= 2) {
                    System.out.println(0);
                } else if (even == 1) {
                    System.out.println(Math.min(d,1));
                } else {
                    System.out.println(Math.min(2,d));
                }
            }
        }

        sc.close();
    }
}
