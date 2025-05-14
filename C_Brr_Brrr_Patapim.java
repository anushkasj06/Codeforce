import java.util.*;

public class C_Brr_Brrr_Patapim{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] g = new int[n][n];

            // Read the n x n grid
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    g[i][j] = sc.nextInt();
                }
            }

            int[] p = new int[2 * n + 1]; 
            boolean[] found = new boolean[2 * n + 1]; 

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int s = i + j + 2; 
                    if (p[s] == 0) {
                        p[s] = g[i][j];
                    }
                }
            }


            for (int s = 2; s <= 2 * n; s++) {
                found[p[s]] = true;
            }

            for (int num = 1; num <= 2 * n; num++) {
                if (!found[num]) {
                    p[1] = num;
                    break;
                }
            }


            for (int i = 1; i <= 2 * n; i++) {
                System.out.print(p[i] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
