import java.util.*;

public class unitedSate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt(); // Number of test cases

        while (cases-- > 0) {
            int n = sc.nextInt();
            long[] arr = new long[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }

            Arrays.sort(arr); // Sorting the array

            List<Long> b = new ArrayList<>();
            List<Long> c = new ArrayList<>();

            int index = 0;
            while (index < n && arr[index] == arr[0]) {
                b.add(arr[index]);
                index++;
            }
            while (index < n) {
                c.add(arr[index]);
                index++;
            }

            // If all elements are the same, it's not possible to split
            if (c.isEmpty()) {
                System.out.println("-1");
            } else {
                System.out.println(b.size() + " " + c.size());

                // Print list b
                for (long num : b) {
                    System.out.print(num + " ");
                }
                System.out.println();

                // Print list c
                for (long num : c) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
