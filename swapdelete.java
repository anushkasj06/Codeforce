import java.util.*;

public class swapdelete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            int no1 = 0;
            int no0 = 0;

            // Count the number of '1's and '0's in the string
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '1') {
                    no1++;
                } else {
                    no0++;
                }
            }

            int n = s.length();
            boolean found = false;

            // Process the string
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '1') {
                    if (no0 > 0) {
                        no0--;
                    } else {
                        System.out.println(n - i);
                        found = true;
                        break;
                    }
                } else {
                    if (no1 > 0) {
                        no1--;
                    } else {
                        System.out.println(n - i);
                        found = true;
                        break;
                    }
                }
            }

            // If the entire string is processed without breaking, print 0
            if (!found) {
                System.out.println(0);
            }
        }
        
        sc.close();
    }
}
