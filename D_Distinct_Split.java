import java.util.*;

public class D_Distinct_Split{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            String s = in.next();
            int[] left = new int[(int)n];
            int[] right = new int[(int)n];
            
            HashSet<Character> set = new HashSet<>();
            for(int i=0;i<n;i++){
                set.add(s.charAt(i));
                left[i] = set.size();
            }

            set.clear();

            for(int i=n-1;i>=0;i--){
                set.add(s.charAt(i));
                right[i] = set.size();
            }

            long ans =0;
            for(int i=0;i<n-1;i++){
                ans = Math.max(ans, left[i]+right[i+1]);
            }
            System.out.println(ans);
            
        }
    }
}