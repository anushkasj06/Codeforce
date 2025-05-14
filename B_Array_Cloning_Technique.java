import java.util.*;

public class B_Array_Cloning_Technique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases
        while (t-->0) {
            int n = sc.nextInt();
            Map<Long, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                Long x = sc.nextLong();
                map.put(x, map.getOrDefault(x, 0) + 1);
            }

            int cnt =0;
           for(int j:map.values()){
                cnt = Math.max(cnt, j);
            }
            int op =0;
            while(cnt<n){
                op++;
                int swap = Math.min(n-cnt, cnt);
                op+=swap;
                cnt+=swap;
            }
            System.out.println(op);

        }
    }
}