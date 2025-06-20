import java.util.*;

public class C_Virus{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // Number of test cases

        while (t-- > 0) {
            int n = sc.nextInt(); // Total number of houses
            int m = sc.nextInt(); // Number of infected houses

            int[] v = new int[m];
            for (int i = 0; i < m; i++) {
                v[i] = sc.nextInt();
            }

            Arrays.sort(v); // Sort infected house positions

            List<Integer> gaps = new ArrayList<>();

            // Compute gaps between infected houses
            for (int i = 0; i < m - 1; i++) {
                gaps.add(v[i + 1] - v[i] - 1);
            }

            // Circular gap (from last to first through the end of array)
            gaps.add(v[0] + n - v[m - 1] - 1);

            // Sort gaps in descending order
            Collections.sort(gaps, Collections.reverseOrder());

            int numSaved = 0, numDays = 0;

            for (int gap : gaps) {
                int currGap = gap - numDays * 2;

                if (currGap > 0) {
                    numSaved++; // Save one house at the left extremity

                    currGap -= 2;

                    if (currGap > 0) {
                        numSaved += currGap; // Save remaining houses in the current gap
                    }

                    numDays += 2; // 1 day from each end of gap
                }
            }

            System.out.println(n - numSaved); // Output houses that get infected
        }

        sc.close();
    }
}