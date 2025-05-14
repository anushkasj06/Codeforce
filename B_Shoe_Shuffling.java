import java.util.*;

public class B_Shoe_Shuffling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            Map<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();
                arr[i] = num;
                map.put(num, map.getOrDefault(num, 0) + 1);
            }

            boolean hasSingle = false;
            for (int val : map.values()) {
                if (val == 1) {
                    hasSingle = true;
                    break;
                }
            }

            if (hasSingle) {
                System.out.println("-1");
                continue;  // Continue to the next test case
            }

            // Fixing the ArrayList initialization
            ArrayList<Integer> list = new ArrayList<>(Collections.nCopies(n, 0));

            for (int i = 0; i < n; i++) {
                int a = i + 1;
                while (i + 1 < n && arr[i] == arr[i + 1]) {
                    list.set(i, i + 2);
                    i++;
                }
                list.set(i, a);
            }

            for (int a : list) {
                System.out.print(a + " ");
            }
            System.out.println();
        }

        sc.close();  // Close scanner after all test cases
    }
}
