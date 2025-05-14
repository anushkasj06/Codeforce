import java.util.*;

public class DoytonaCost {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            int k = in.nextInt();

            int[] arr = new int[n];

            for(int i=0;i<n;i++){
                arr[i] = in.nextInt();
            }

            boolean found = false;

            for(int i=0; i<n; i++){
                if(arr[i]==k){
                    found = true;
                }
            }

            if(found){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

        }
    }
}
