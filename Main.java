import java.util.*;

public class Main {
    static class Pair {
        long first, second;

        Pair(long first, long second) {
            this.first = first;
            this.second = second;
        }
    }

    // Custom comparator to sort the pairs as per the given logic
    static class PairComparator implements Comparator<Pair> {
        @Override
        public int compare(Pair p1, Pair p2) {
            if (p1.first == p2.first) {
                return Long.compare(p2.second, p1.second); // Descending on second
            } else {
                return Long.compare(p1.first, p2.first); // Ascending on first
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases

        while (t-- > 0) {
            long n = sc.nextLong();
            long p = sc.nextLong();

            long[] arr = new long[(int) n];
            long[] brr = new long[(int) n];
            List<Pair> vp = new ArrayList<>();

            // Reading the first array
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }

            // Reading the second array and forming pairs
            for (int i = 0; i < n; i++) {
                brr[i] = sc.nextLong();
                vp.add(new Pair(Math.min(brr[i], p), arr[i]));
            }

            // Special case when n == 1
            if (n == 1) {
                System.out.println(p);
                continue;
            }

            // Sorting the pairs using custom comparator
            vp.sort(new PairComparator());

            long ans = p;
            long rem = n - 1;

            // Calculating the final answer
            for (int i = 0; i < n - 1; i++) {
                long minVal = Math.min(vp.get(i).second, rem);
                ans += minVal * vp.get(i).first;
                rem -= minVal;
            }

            // Printing the final answer
            System.out.println(ans);
        }

        sc.close();
    }
}
