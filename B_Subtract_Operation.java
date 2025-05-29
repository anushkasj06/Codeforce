import java.util.*;

public class B_Subtract_Operation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // number of test cases
        while (t-- > 0) {
            int n = sc.nextInt();  // number of elements
            int k = sc.nextInt();  // target value
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            Set<Integer> set = new HashSet<>();
            for (int num : arr) {
                set.add(num);
            }

            boolean found = false;
            for (int i = 0; i < n; i++) {
                if (set.contains(arr[i] - k)) {
                    found = true;
                    break;
                }
            }

            System.out.println(found ? "YES" : "NO");
        }

        sc.close();
    }
}
