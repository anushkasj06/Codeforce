import java.util.*;

public class E_Cardboard_for_Pictures{
    public static void solve(Scanner sc){
        int n = sc.nextInt();
            long c = sc.nextLong();
            int[] s = new int[n];
            for(int i=0;i<n;i++){
                s[i] = sc.nextInt();
            }
            long l =1;
            long h =(long) 1e9;
            while(l<=h){
                long mid = (l+h)/2;
                long area_sum =0;
                for(int i=0;i<n;i++){
                    long len = 2*mid+s[i];
                    area_sum += len*len;
                    if(area_sum>c){
                        break;
                    }
                    
                }
                if(area_sum==c){
                    System.out.println(mid);
                    return;
                }
                if(area_sum<c){
                    l = mid+1;
                }else{
                    h = mid-1;
                }

            
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            solve(sc);
        }
    }
}