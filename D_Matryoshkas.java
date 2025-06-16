import java.util.*;

public class D_Matryoshkas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] v = new int[n];

            for (int i = 0; i < n; i++) {
                v[i] = sc.nextInt(); // O(N)
            }

            TreeMap<Integer, Integer> cnt = new TreeMap<>();

            for (int i = 0; i < n; i++) {
                cnt.put(v[i], cnt.getOrDefault(v[i], 0) + 1); // O(N log N)
            }

            int ans = 0;

            for (Map.Entry<Integer, Integer> entry : cnt.entrySet()) {
                int ele = entry.getKey();
                int fre = entry.getValue();

                int prevFreq = cnt.getOrDefault(ele - 1, 0);
                ans += Math.max(0, fre - prevFreq); // O(N log N)
            }

            System.out.println(ans);
        }
    }
}
