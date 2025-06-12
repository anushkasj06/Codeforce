import java.util.*;

public class B_Make_It_Permutation{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();  // Number of test cases

        while (t-- > 0) {
            int n = sc.nextInt();  // Size of matrix

            List<int[]> ops = new ArrayList<>();

            // Reverse entire first row
            ops.add(new int[]{1, 1, n});

            // For rows 2 to n
            for (int i = 2; i <= n; i++) {
                int pre_len = n - i + 1;
                int suf_start = pre_len + 1;

                // Reverse prefix: [1, pre_len]
                ops.add(new int[]{i, 1, pre_len});

                // Reverse suffix: [suf_start, n] if valid
                if (suf_start <= n) {
                    ops.add(new int[]{i, suf_start, n});
                }
            }

            // Output the result
            System.out.println(ops.size());
            for (int[] op : ops) {
                System.out.println(op[0] + " " + op[1] + " " + op[2]);
            }
        }

        sc.close();

        
    }
}