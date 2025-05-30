import java.util.Arrays;
import java.util.HashMap;

public class leetcode_506 {
     public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        int[] sorted = score.clone();  // create a copy to sort
        Arrays.sort(sorted);
        HashMap<Integer, String> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int rank = n - i;
            if (rank == 1) {
                map.put(sorted[i], "Gold Medal");
            } else if (rank == 2) {
                map.put(sorted[i], "Silver Medal");
            } else if (rank == 3) {
                map.put(sorted[i], "Bronze Medal");
            } else {
                map.put(sorted[i], String.valueOf(rank));
            }
        }

        String[] ans = new String[n];
        for (int i = 0; i < n; i++) {
            ans[i] = map.get(score[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        leetcode_506 solution = new leetcode_506();
        int[] score = {5, 4, 3, 2, 1};
        String[] result = solution.findRelativeRanks(score);
        System.out.println(Arrays.toString(result));
    }
}
