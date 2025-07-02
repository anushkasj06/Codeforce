import java.util.*;

public class B_Pleasant_Pairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();  // number of test cases

        while (t-- > 0) {
            int n = sc.nextInt();

            // List of pairs: (value, index)
            List<Pair> list = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                long val = sc.nextLong();
                list.add(new Pair(val, i + 1)); // 1-based index
            }

            // Sort based on value
            list.sort(Comparator.comparingLong(p -> p.val));

            int ans = 0;

            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    long product = list.get(i).val * list.get(j).val;

                    if (product >= 2L * n) break;

                    if (product == list.get(i).index + list.get(j).index) {
                        ans++;
                    }
                }
            }

            System.out.println(ans);
        }
    }

    // Custom Pair class
    static class Pair {
        long val;
        int index;

        Pair(long val, int index) {
            this.val = val;
            this.index = index;
        }
    }
}
