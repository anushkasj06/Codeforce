import java.util.*;


public class A_Everybody_Likes_Good_Arrays {
    
    static boolean odd(int n) {
        return n % 2 != 0;
    }
    static boolean even(int n) {
        return n % 2 == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int op =0;
            for(int i=0;i<n-1;i++){
                if((odd(arr[i]) && odd(arr[i+1])) || (even(arr[i]) && even(arr[i+1]))){
                    op++;
                }
            }
            System.out.println(op);
        }
    }

}