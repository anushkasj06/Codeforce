import java.util.*;

public class B_Comparison_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            
            int maxStreak = 0;
            int currentStreak = 0;
            
            for (int i = 0; i < s.length(); i++) {
                if (i == 0 || s.charAt(i) == s.charAt(i - 1)) {
                    currentStreak++;
                } else {
                    currentStreak = 1;
                }
                maxStreak = Math.max(maxStreak, currentStreak);
            }
            
            System.out.println(maxStreak + 1); // +1 for array having n+1 elements
        }
    }
}
