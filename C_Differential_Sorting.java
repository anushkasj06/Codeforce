import java.util.*;

public class C_Differential_Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();  // Number of test cases

        while (t-- > 0) {
            solve(sc);        
        }

        sc.close();
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        if(arr[n-2]> arr[n-1]) {
            System.out.println(-1);
            return;
        }else if(arr[n-1]>=0){
            System.out.println(n-2);
            for(int i=1;i<=n-2;i++){
                System.out.print(i + " "+(n-1)+ " "+n + "\n");
            }
            return;
        }else{
            if(isSorted(arr)) {
                System.out.println(0);
                return;
            }else{
                System.out.println(-1);
            }
        }

       
    }
     public static boolean isSorted(int[] arr) {
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < arr[i - 1]) {
                    return false;
                }
            }
            return true;
        }
}