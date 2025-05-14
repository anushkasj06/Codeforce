import java.util.*;

public class B_Numbers_Box{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int neg_val =0;
            boolean isZero = false;
            int min = 1000;
            int sum =0;
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    int a = sc.nextInt();
                    if(a<0){
                        neg_val++;
                    }
                    sum+=Math.abs(a);
                    if(a==0){
                        isZero = true;
                    }
                    min = Math.min(min, Math.abs(a));
                }
            }
            if(neg_val%2==0){
                System.out.println(sum);
            }else if(neg_val%2!=0 && isZero){
                System.out.println(sum);
            }else{
                System.out.println(sum-2*min);
            }
                
        }
    }
}