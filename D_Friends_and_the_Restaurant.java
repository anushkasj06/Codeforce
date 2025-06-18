import java.util.*;

public class D_Friends_and_the_Restaurant {
    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        for (int i = 0; i < n; i++) b[i] = sc.nextInt();

        int cnt1 = 0;
        List<Integer> v1 = new ArrayList<>();
        TreeMap<Integer, Integer> msl = new TreeMap<>();  // Multiset using TreeMap

        for (int i = 0; i < n; i++) {
            int tot = b[i] - a[i];
            if (tot >= 0) {
                v1.add(tot);
            } else {
                int val = -tot;
                msl.put(val, msl.getOrDefault(val, 0) + 1);
            }
        }

        int ans = v1.size();
        Collections.sort(v1);

        for (int i = 0; i < v1.size(); i++) {
            int val = v1.get(i);
            Integer key = msl.floorKey(val);
            if (key != null) {
                cnt1++;
                // remove one occurrence
                if (msl.get(key) == 1) {
                    msl.remove(key);
                } else {
                    msl.put(key, msl.get(key) - 1);
                }
            }
        }

        System.out.println((ans + cnt1) / 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // Number of test cases
        while (t-- > 0) {
            solve(sc);
        }
        sc.close();
    }
}
