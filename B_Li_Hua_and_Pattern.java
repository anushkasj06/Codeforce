import java.util.*;

public class B_Li_Hua_and_Pattern {
    public static void solve(Scanner scanner) {
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[][] x = new int[a + 1][a + 1]; // Using 1-based indexing

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a; j++) {
                x[i][j] = scanner.nextInt();
            }
        }

        int sum = 0;
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a; j++) {
                if (x[i][j] != x[a - i + 1][a - j + 1]) {
                    sum++;
                }
            }
        }

        sum /= 2;

        if (sum > b) {
            System.out.println("NO");
            return;
        }

        b -= sum;

        if (a % 2 == 1) {
            System.out.println("YES");
        } else if (b % 2 == 1) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();

        while (testCase-- > 0) {
            solve(scanner);
        }
    }
}
