import java.util.*;

public class A_Olympiad_Date {
    static final String TARGET = "01032025";

    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] digits = new int[n];

        for (int i = 0; i < n; i++) {
            digits[i] = sc.nextInt();
        }

        Map<Character, Integer> freq = new HashMap<>();
        for (char c : TARGET.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        Map<Character, Integer> count = new HashMap<>();
        for (int i = 0; i < n; i++) {
            char c = (char) ('0' + digits[i]);
            count.put(c, count.getOrDefault(c, 0) + 1);

            boolean canForm = true;
            for (char ch : TARGET.toCharArray()) {
                if (count.getOrDefault(ch, 0) < freq.get(ch)) {
                    canForm = false;
                    break;
                }
            }

            if (canForm) {
                System.out.println(i + 1);
                return;
            }
        }

        System.out.println(0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            solve(sc);
        }
    }
}
