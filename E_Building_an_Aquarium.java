import java.util.*;

public class E_Building_an_Aquarium {

    public static boolean canposses(long h,long[] a,long x){
        long sum =0;
        for(long i:a){
            if(h>=i){
                sum += (h-i);
            }
        }
        if(sum<=x){
            return true;
        }else{
            return false;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long x = sc.nextLong();
            long[] a = new long[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextLong();
            }
            long h = (long) 3e9;
            long l =1;
            long ans =1;
            while(l<=h){
                long mid = (l+h)/2;
                if(canposses(mid,a,x)){
                    ans = mid;
                    l= mid+1;
                }else{
                    h = mid-1;
                }  
            }
            System.out.println(ans);
        }
    }
}