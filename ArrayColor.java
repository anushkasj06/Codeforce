import java.util.*;

public class ArrayColor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int[] arr = new int[n];

            int odd = 0;

            for(int i=0; i<n; i++){
                arr[i] = in.nextInt();
                if(arr[i]%2!=0){
                    odd++;
                }
                
            }

            if(odd%2==0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

        }
    }
}
