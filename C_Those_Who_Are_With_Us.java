import java.util.*;

public class C_Those_Who_Are_With_Us {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] arr = new int[n][m];
            int max = 0;
            int x = 0;
            int y = 0;
            int secondmax = Integer.MIN_VALUE;

            // Read input, find max and second max
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = sc.nextInt();
                    if (arr[i][j] > max) {
                        secondmax = max; // update secondmax before max
                        max = arr[i][j];
                        x = i;
                        y = j;
                    } else if (arr[i][j] > secondmax && arr[i][j] < max) {
                        secondmax = arr[i][j];
                    }
                }
            }

            // Decrement column y (except intersection)
            for (int i = 0; i < n; i++) {
                if (i != x) arr[i][y]--;
            }

            // Decrement row x
            for (int j = 0; j < m; j++) {
                arr[x][j]--;
            }

            // Check if max still exists in matrix
            boolean maxfound = false;
            for (int i = 0; i < n && !maxfound; i++) {
                for (int j = 0; j < m; j++) {
                    if (arr[i][j] == max) {
                        maxfound = true;
                        break;
                    }
                }
            }

            // Output based on whether max still exists
            if (maxfound) {
                System.out.println(max);
            } else {
                if (secondmax == Integer.MIN_VALUE) {
                    System.out.println(max);
                } else {
                    System.out.println(secondmax);
                }
            }
        }
    }
}
