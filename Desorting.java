import java.util.Scanner;

public class Desorting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }

            boolean isnonSorted = false;
            for (int i = 1; i < n; i++) {
                if (arr[i] < arr[i - 1]) {
                    isnonSorted = true;
                    break;
                }
            }

            if (isnonSorted) {
                System.out.println(0);
            } else {
                int ans = Integer.MAX_VALUE;
                for (int i = 1; i < n; i++) {
                    int diff = (int) Math.ceil((arr[i] - arr[i - 1] + 1) / 2.0);
                    ans = Math.min(ans, diff);
                }
                System.out.println(ans);
            }
        }
        in.close();
    }
}
