import java.util.*;

public class blankspace {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = in.nextInt();
            }

            int max = Integer.MIN_VALUE;
            int count =0;
            for(int i=0; i<n; i++){
                if(arr[i]==0){
                    count++;
                }else{
                    count =0;
                }
                max = Math.max(max, count);
            }

            System.out.println(max);
        }
    }
}
