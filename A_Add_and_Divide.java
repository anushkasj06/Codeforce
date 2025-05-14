import java.util.*;

public class A_Add_and_Divide {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long a = sc.nextInt();
            long b = sc.nextInt();
            long ans = Long.MAX_VALUE;

            for(int i=0;i<=31;i++){
                long B = b+i;
                if(B==1){
                    continue;
                }
                long A = a;
                int op = i;
                while(A>0){
                    A = A/B;
                    op++;
                    
                }
                ans = Math.min(ans,op);
            }
            System.out.println(ans);

        }
        sc.close();
    }
}