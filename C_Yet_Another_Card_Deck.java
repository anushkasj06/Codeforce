import java.util.*;

public class C_Yet_Another_Card_Deck{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();

        int[] first_pos = new int[51];
        Arrays.fill(first_pos, n + 1); // Initialize all positions with n+1

        for (int i = 1; i <= n; i++) {
            int color = sc.nextInt();
            if (first_pos[color] == n + 1) {
                first_pos[color] = i;
            }
        }

        while (q-- > 0) {
            int color = sc.nextInt();
            int ans = first_pos[color];
            for (int i = 1; i <= 50; i++) {
                if (first_pos[i] < ans) {
                    first_pos[i]++;
                }
            }
            first_pos[color] = 1;
            System.out.print(ans + " ");
        }

        System.out.println();
    }
}