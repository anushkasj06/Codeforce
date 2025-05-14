import java.util.*;

public class B_Sum_of_Medians {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // number of test cases
        while (t-- > 0) {
            int n = scanner.nextInt(); // size of each group
            int k = scanner.nextInt(); // number of groups
            int[] a = new int[n * k]; // use 0-based indexing
            for (int i = 0; i < n * k; i++) {
                a[i] = scanner.nextInt();
            }

            int x = n / 2;
            long ans = 0;
            int index = n * k - x - 1; // starting index of last median

            for (int i = 0; i < k; i++) {
                ans += a[index];
                index -= (x + 1); // move to the median of the previous group
            }

            System.out.println(ans);
        }
    }
}
