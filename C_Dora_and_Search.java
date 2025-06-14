import java.util.*;

public class C_Dora_and_Search {

    public static boolean isMinOrMax(int val, TreeSet<Integer> segEle) {
        return segEle.first() == val || segEle.last() == val;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            TreeSet<Integer> segEle = new TreeSet<>();

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                segEle.add(arr[i]);
            }

            int i = 0, j = n - 1;

            while (i < j) {
                if (isMinOrMax(arr[i], segEle)) {
                    segEle.remove(arr[i]);
                    i++;
                    continue;
                }

                if (isMinOrMax(arr[j], segEle)) {
                    segEle.remove(arr[j]);
                    j--;
                    continue;
                }

                break;
            }

            if (i < j) {
                System.out.println((i + 1) + " " + (j + 1));
            } else {
                System.out.println("-1");
            }
        }
    }
}
