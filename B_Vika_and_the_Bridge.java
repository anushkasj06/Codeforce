import java.util.*;

public class B_Vika_and_the_Bridge{
    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        ArrayList<ArrayList<Integer>> vl = new ArrayList<>();

        // Initializing vl with k+1 ArrayLists
        for (int i = 0; i <= k; i++) {
            vl.add(new ArrayList<>());
            vl.get(i).add(0); // equivalent to vl[i].pb(0);
        }

        // Reading input into array and populating vl
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            vl.get(a[i]).add(i + 1); // equivalent to vl[a[i]].pb(i+1);
        }

        for (int i = 1; i <= k; i++) {
            vl.get(i).add(n + 1); // append n+1
        }

        int ans = n + 1;

        for (int i = 1; i <= k; i++) {
            int z1 = 0, z2 = 0;
            ArrayList<Integer> temp = vl.get(i);

            for (int j = 1; j < temp.size(); j++) {
                int al = temp.get(j) - temp.get(j - 1) - 1;

                if (al <= z2) {
                    // do nothing
                } else if (al >= z2 && al <= z1) {
                    z2 = al;
                } else if (al >= z1) {
                    z2 = z1;
                    z1 = al;
                }
            }

            ans = Math.min(ans, Math.max(z2, z1 / 2));
        }

        System.out.println(ans);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }


    }
}