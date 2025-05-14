import java.util.*;

public class C_Yarik_and_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases
        while(t-->0){
           int n = sc.nextInt();
           int[] a = new int[n];
           for(int i=0; i<n; i++){
               a[i] = sc.nextInt();
           }

           int sum = a[0];
           int max = a[0];
           for(int i=0;i<n-1;i++){
            if((Math.abs(a[i]) % 2) == (Math.abs(a[i + 1]) % 2)){
                sum = a[i+1];
                max = Math.max(max, sum);
            }else{
                int sum1  = sum + a[i+1];
                int sum2 = a[i+1];
                sum = Math.max(sum1, sum2);
                max = Math.max(max, sum);

            }
           }
           System.out.println(max);
        }
        sc.close();
        
    }
}