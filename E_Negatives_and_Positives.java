import java.util.*;

public class E_Negatives_and_Positives {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();

        while (testCases-- > 0) {
            solve(sc);
        }
    }

    static void solve(Scanner sc) {
        int n = sc.nextInt();
        long totalSum = 0;
        List<Long> negative = new ArrayList<>();
        List<Long> positive = new ArrayList<>();
        int zeroCount = 0;

        for (int i = 0; i < n; i++) {
            long temp = sc.nextLong();
            if (temp < 0) {
                negative.add(-temp);  // store as positive for comparison
            } else if (temp == 0) {
                zeroCount++;
            } else {
                positive.add(temp);
            }
        }

        // Sort positive in descending order
        Collections.sort(positive, Collections.reverseOrder());

        for (long val : positive) {
            totalSum += val;
        }

        if (negative.size() % 2 == 1) {
            if (zeroCount == 0) {
                Collections.sort(negative, Collections.reverseOrder());
                for (long val : negative) {
                    totalSum += val;
                }
                if (!positive.isEmpty()) {
                    totalSum -= 2 * Math.min(positive.get(positive.size() - 1), negative.get(negative.size() - 1));
                } else {
                    totalSum -= 2 * negative.get(negative.size() - 1);
                }
            } else {
                for (long val : negative) {
                    totalSum += val;
                }
            }
        } else {
            for (long val : negative) {
                totalSum += val;
            }
        }

        System.out.println(totalSum);
    }
}
