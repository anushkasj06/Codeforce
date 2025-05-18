import java.util.*;


public class A_Make_it_Beautiful {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
           int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
           if(a[n-1]==a[0]){
            System.out.println("NO");
           }else{
            System.out.println("YES");
            System.out.print(a[n-1]+" "+a[0]+" ");
            for (int i = 1; i < n - 1; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
           }
        }
    }
}