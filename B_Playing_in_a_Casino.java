import java.util.*;

public class B_Playing_in_a_Casino {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt(); // Number of test cases

        while (tt-- > 0) {
            codeforces(sc);
        }
    }

    public static void codeforces(Scanner sc) {
        int m = sc.nextInt(); // number of cards (rows)
        int n = sc.nextInt(); // numbers on each card (columns)

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(sc.nextInt());
            }
            ans.add(row);
        }

        long finalSum = 0;

        for (int j = 0; j < n; j++) {
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < m; i++) {
                temp.add(ans.get(i).get(j));
            }

            Collections.sort(temp);

            int l = m - 1;
            int k = 1;

            for (int b = m - 1; b > 0; b--) {
                int x = Math.abs(temp.get(b) - temp.get(b - 1));
                finalSum += (long) x * l * k;
                k += 1;
                l -= 1;
            }
        }

        System.out.println(finalSum);
    }
}
