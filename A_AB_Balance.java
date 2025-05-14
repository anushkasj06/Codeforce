import java.util.Scanner;

public class A_AB_Balance {

    static void solve(Scanner sc) {
        String s = sc.next();
        int n = s.length();

        if (s.charAt(0) == s.charAt(n - 1)) {
            System.out.println(s);
        } else {
            char[] chars = s.toCharArray();
            chars[n - 1] = chars[0];
            System.out.println(new String(chars));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            solve(sc);
        }
    }
}
