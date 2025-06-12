import java.util.*;

public class C_Contrast_Value{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t  = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }
    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if(n==1){
            System.out.println(1);
            return;
        
        }
        int state=0;
        int c =0;
        for(int i=1;i<n;i++){
            if((arr[i-1]>arr[i]) && state!=1){
                c++;
                state=1;
            }else if((arr[i-1]<arr[i]) && state!=-1){
                c++;
                state=-1;
            }
        }
        System.out.println(c+1);
    

    }

}