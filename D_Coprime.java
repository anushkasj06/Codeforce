import java.util.*;

public class D_Coprime {

    public static int gcd(int a, int b) {
        while(b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n + 1]; // 1-based index

            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextInt();
            }

            // Map to store latest index of each number
            Map<Integer, Integer> lastIndex = new HashMap<>();
            for (int i = 1; i <= n; i++) {
                lastIndex.put(a[i], i);
            }

            int maxSum = -1;

            for (int x : lastIndex.keySet()) {
                for (int y : lastIndex.keySet()) {
                    if (gcd(x, y) == 1) {
                        int sum = lastIndex.get(x) + lastIndex.get(y);
                        maxSum = Math.max(maxSum, sum);
                    }
                }
            }

            System.out.println(maxSum);
        }
    }
}
