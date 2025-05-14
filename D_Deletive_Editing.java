import java.util.*;

public class D_Deletive_Editing {
    public static void solve(Scanner sc) {
        String s = sc.next();
        String t = sc.next();
        
        int[] cnt = new int[26];
        for (char ch : s.toCharArray()) {
            cnt[ch - 'A']++;
        }
        
        StringBuilder temp = new StringBuilder();
        
        for (int i = s.length() - 1; i >= 0; i--) {
            if (cnt[s.charAt(i) - 'A'] > 0) {
                temp.append(s.charAt(i));
                cnt[s.charAt(i) - 'A']--;
            }
        }
        
        temp.reverse();
        
        if (temp.toString().equals(t)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
        sc.close(); // <-- close scanner after the loop
    }
}
