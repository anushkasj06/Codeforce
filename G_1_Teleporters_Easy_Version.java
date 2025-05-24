import java.util.*;

public class G_1_Teleporters_Easy_Version {
    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        int c = sc.nextInt();
        int[] arr = new int[n];
        long sum =0;
        for(int i = 0; i < n; i++) {
            int x = sc.nextInt();
            arr[i] = x+i+1;
        }
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            sum += arr[i];
            if(sum > c) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(n);
        return;

    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            solve(sc);
        }
    }
}