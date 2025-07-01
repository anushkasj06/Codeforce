import java.util.*;

public class B_Stone_Age_Problem {

    static class Pair {
        int value; // value of stone
        int ind;   // last updated at query index

        Pair(int value, int ind) {
            this.value = value;
            this.ind = ind;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // Number of stones
        int q = sc.nextInt(); // Number of queries

        ArrayList<Pair> v = new ArrayList<>();
        long sum = 0;

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            v.add(new Pair(a, 0));
            sum += a;
        }

        Pair global = new Pair(0, -1); // Global assignment

        for (int i = 1; i <= q; i++) {
            int x = sc.nextInt(); // Query type

            if (x == 1) {
                int ind = sc.nextInt() - 1; // 1-based to 0-based index
                int val = sc.nextInt();

                if (v.get(ind).ind > global.ind) {
                    sum += (val - v.get(ind).value);
                } else {
                    sum += (val - global.value);
                }

                v.get(ind).value = val;
                v.get(ind).ind = i;

            } else {
                int val = sc.nextInt();
                global.value = val;
                global.ind = i;
                sum = (long) val * n;
            }

            System.out.println(sum);
        }

        sc.close();
    }
}
