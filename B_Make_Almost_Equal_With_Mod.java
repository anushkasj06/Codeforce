import java.util.*;

public class B_Make_Almost_Equal_With_Mod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases

        while (t-- > 0) {
            int n = sc.nextInt(); // size of array
            long[] arr = new long[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong(); // input array elements
            }

            long ans = 0;

            for (int i = 1; i <= 60; i++) {
                long k = 1L << i; // 2^i
                Set<Long> modSet = new HashSet<>();

                for (int j = 0; j < n; j++) {
                    modSet.add(arr[j] % k);
                }

                if (modSet.size() == 2) { // if exactly two distinct remainders
                    ans = k;
                    break;
                }
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
