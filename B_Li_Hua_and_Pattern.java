import java.util.*;

public class B_Li_Hua_and_Pattern {
    public static void solve(int n, int b, int[][] a) {
        int sum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] != a[n - i - 1][n - j - 1]) {
                    sum++;
                }
            }
        }

        sum = sum / 2;  // Each mismatch is counted twice
        if (sum > b) {
            System.out.println("NO");
            return;
        }

        b -= sum;
        if (n % 2 == 1) {
            System.out.println("YES");
        } else if (b % 2 == 1) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
        return;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();  // Read the number of test cases
        while (t-- > 0) {
            int n = scanner.nextInt();  // Read the size of the matrix
            int b = scanner.nextInt();  // Read the number of allowed changes
            int[][] a = new int[n][n];  // Initialize the matrix

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = scanner.nextInt();  // Read the matrix elements
                }
            }

            solve(n, b, a);  // Call the solve function
            
        }
    }
}
