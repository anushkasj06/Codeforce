import java.util.*;

public class B_NIT_Destroys_the_Universe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases
        while(t-- > 0){
           int n = sc.nextInt();
           long[] arr = new long[n+1];
           arr[0] = 0;
            for(int i = 1; i <=n; i++){
                arr[i] = sc.nextLong();
            }
            int op =0;
            for(int i=1;i<=n;i++){
                if(arr[i]>0 && arr[i-1]==0){
                    op++;
                }
            }
            System.out.println(Math.min(op,2));

            
        }
    }
}