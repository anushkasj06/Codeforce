import java.util.Scanner;

public class dottrycount {

    public static boolean check(String s, String x) {
        if (x.length() < s.length()) {
            return false;
        }
        for (int i = 0; i <= x.length() - s.length(); i++) {
            if (x.substring(i, i + s.length()).equals(s)) { // Fixed indexing and string comparison
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int m = in.nextInt();
            String x = in.next();
            String s = in.next();
            long ans = -1;

            for (int i = 0; i <= 5; i++) { // At most 5 concatenations since n*m ≤ 25
                if (check(s, x)) {
                    ans = i;
                    break;
                }
                x = x + x; // Concatenation
            }
            System.out.println(ans);
        }
        in.close();
    }
}
