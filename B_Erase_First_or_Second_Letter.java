import java.util.*;

public class B_Erase_First_or_Second_Letter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();  // assuming s is on the same line as n, no extra newline
            
            int ans = 0;
            HashSet<Character> set = new HashSet<>();
            
            for(int i = 0; i < n; i++) {
                char ch = s.charAt(i);
                if (!set.contains(ch)) {
                    ans += (n - i);
                    set.add(ch);
                }
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
