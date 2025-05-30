import java.util.*;

public class B_A_Perfectly_Balanced_String {
    public static void solve(Scanner sc) {
        String s = sc.next();
            int n = s.length();
            int k = 0;
            HashSet<Character> hs = new HashSet<>();
            for (k = 0; k < n; k++) {
                if(!hs.contains(s.charAt(k))){
                    hs.add(s.charAt(k));
                }else{
                    break;
                }
            }
            for(int i=k;i<n;i++){
                if(s.charAt(i)!= s.charAt(i-k)){
                    System.out.println("NO");
                    return;
                }
            }
            System.out.println("YES");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
            
        }
    }
}