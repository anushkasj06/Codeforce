import java.util.*;

public class B_Collecting_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases
        while(t-->0){
            int n = sc.nextInt();
            long[] a = new long[n];
            long[] b = new long[n];
            long[] psum = new long[n];
            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();
                b[i] = a[i];
            }
            Arrays.sort(b);
            psum[0] = b[0];
            for(int i=1; i<n; i++){
                psum[i] = psum[i-1] + b[i];
            }
            HashMap<Long, Integer> map = new HashMap<>();
            map.put(b[n-1],n-1);
            for(int i=n-2; i>=0; i--){
                if(psum[i]>=b[i+1]){
                    map.put(b[i], map.get(b[i+1]));
                }else{
                    map.put(b[i],i);
                }
            }

            for(long val : a){
                System.out.print(map.get(val)+" ");
            }
            System.out.println();

        }
        
    }
}