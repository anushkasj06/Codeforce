import java.util.*;

public class B_AND_Sorting{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            int ans = (1<<30)-1;
            for(int i=0;i<n;i++){
                int x = sc.nextInt();
                if(x!=i){
                    ans &= x;
                }
            }
            System.out.println(ans);
            
        }

    }
}