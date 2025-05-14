import java.util.*;

public class B_01_Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases
        while (t-- > 0) {
            String s = scanner.next();
            int c0=0;
            int c1=0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    c0++;
                } else {
                    c1++;
                }
            }
            
            int x = Math.min(c0, c1);
            if (x % 2 == 0) {
                System.out.println("NET");
            } else {
                System.out.println("DA");
            }
        }
    }
}