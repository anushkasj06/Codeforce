import java.util.*;
public class unitarray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-->0) {
            int n = in.nextInt();
            int[] arr = new int[n];
            int f1 =0; 
            int f2 =0;

            for(int i=0;i<n;i++){
                arr[i] = in.nextInt();
                if(arr[i]==-1){
                    f1++;
                }else{
                    f2++;
                }
            }
            
            if(f1<=f2){
                if(f1%2!=0 ){
                    System.out.println(1);
                }else{
                    System.out.println(0);
                }
            }else{
                int ops = f1 - n/2;
                if((n/2)%2!=0){
                    ops++;
                }
                System.out.println(ops);
            }
            
        }
    }
}
