import java.util.*;

public class B_Make_It_Increasing {
    public static void solve( Scanner sc){
        int n = sc.nextInt(); // Number of elements in the array
        long a[] = new long[n]; // Array to store the elements
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong(); // Read each element into the array
        }
        int op = 0;
        for(int i=n-2;i>=0;i--){
            while(a[i]>=a[i+1] && a[i+1]>0){
                a[i]/=2;
                op++;
            }
            if(a[i+1] ==0){
                System.out.println(-1);
                return;
            }

        }
        System.out.println(op);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases
        while (t-- > 0) {
           solve(sc);
        }
        sc.close();
    }
}