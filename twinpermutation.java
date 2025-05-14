import java.util.*;

public class twinpermutation {
   public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    while(t-->0){
        int n = in.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }

        for(int i=0; i<n; i++){
            arr[i] = n+1 - arr[i];
        }

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }

   }
}
