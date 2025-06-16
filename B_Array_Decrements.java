import java.util.*;

public class B_Array_Decrements{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int[] brr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            int maxDiff= 0;
            for(int i=0;i<n;i++){
                brr[i] = sc.nextInt();
                maxDiff = Math.max(maxDiff,arr[i]-brr[i]);
                
            }
            boolean flag = true;
            for(int i=0;i<n;i++){
                if(brr[i]==0){
                    if(arr[i]>maxDiff){
                        flag = false;
                        break;  
                    }
                }else{
                    int d = arr[i] - brr[i];
                    if(d<0){
                        flag = false;
                        break;
                    }
                    if(d!=maxDiff){
                        flag = false;
                        break;
                    }
                }
            }
            if(!flag){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
    }
}