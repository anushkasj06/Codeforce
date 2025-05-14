import java.util.*;

public class B_Deja_Vu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases
        while(t-->0){
           int n = sc.nextInt();
           int q = sc.nextInt();
           int[] a = new int[n];
              for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
              }
               int l = Integer.MAX_VALUE;

               for(int i=0;i<q;i++){
                int x = sc.nextInt();
                if(l>x){
                    l = x;
                    for(int j=0;j<n;j++){
                        if(a[j]%(Math.pow(2,x))==0){
                            a[j] += (int)Math.pow(2,x-1);
                        }
                    }
                }
               }
                for(int i=0;i<n;i++){
                 System.out.print(a[i]+" ");
                }
                    System.out.println();
        }
        sc.close();
    }
}