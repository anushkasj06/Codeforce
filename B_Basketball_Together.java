import java.util.*;

public class B_Basketball_Together {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        long d = sc.nextLong();
        Long[] p = new Long[n]; // Use Long[] instead of int[] to support Collections.reverseOrder()

        // Input the array
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextLong();
        }

        // Sort in descending order
       Arrays.sort(p,Collections.reverseOrder());

       long players=0;
       int i=0;
       int wins =0;
       while(players<=n && i<n){
        long x = (long)Math.ceil((d+1)/(p[i]*1.0));
        players += x;
        if(players<=n)wins++;
        i++;
        if(players>n)break;
       }
       System.out.println(wins);
        sc.close();
    }
}
