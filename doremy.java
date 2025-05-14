import java.util.*;

public class doremy {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }

            Map<Integer, Integer> mp = new HashMap<>();
            for (int i = 0; i < n; i++) {
                mp.put(a[i], mp.getOrDefault(a[i], 0) + 1);
            }

            if (mp.size() == 1) { // If only one unique element exists
                System.out.println("Yes");
            } else if (mp.size() >= 3) { // If more than 2 unique elements exist
                System.out.println("No");
            } else {
                Iterator<Integer> it = mp.values().iterator();
                int freq1 = it.next();
                int freq2 = it.next();

                if (freq1 == freq2 || (n % 2 == 1 && Math.abs(freq1 - freq2) == 1)) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        }
        in.close();
    }
}
