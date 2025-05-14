import java.util.*;

public class B_MEXor_Mixup{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextInt();
        while(t-->0){
            long a = sc.nextInt();
            long b = sc.nextInt();
            long n = a-1;
            long x=0;
            if(n%4==0){
                x=n;
            }
            if(n%4==1){
                x=1;
            }
            if(n%4==2){
                x=n+1;
            }
            if(n%4==3){
                x=0;
            }

            if(x==b){
                System.out.println(a);
            }else{
                long y = x^b;
                if(y!=a){
                    System.out.println(a+1);
                }else{
                    System.out.println(a+2);
                }
            }
            
        }
        
    }
}