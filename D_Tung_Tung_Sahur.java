import java.util.Scanner;

public class D_Tung_Tung_Sahur{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            String p = sc.next();
            String s = sc.next();
            
            int lenp = p.length();
            int lens = s.length();
            int x = lens - lenp;
            int d = 0;
            int j = 0;
            boolean valid = true;
            
            for (int i = 0; i < lenp; i++) {
                if (j >= lens || s.charAt(j) != p.charAt(i)) {
                    valid = false;
                    break;
                }

                int remaining = lenp - i;
                int requiredRemaining = x - d;

                if (j + 1 < lens && s.charAt(j + 1) == p.charAt(i)) {
                    if (requiredRemaining > (remaining - 1)) {
                        d++;
                        j += 2;
                    } else {
                        j++;
                    }
                } else {
                    j++;
                }
            }

            if (j != lens || d != x) {
                valid = false;
            }

            System.out.println(valid ? "YES" : "NO");
        }

        sc.close();
    }
}
