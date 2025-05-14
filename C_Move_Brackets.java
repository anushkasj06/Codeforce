import java.util.*;

public class C_Move_Brackets{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String s = sc.next();
            int open = 0, close = 0;
            int op =0;
            for(int i=0;i<n;i++){
                if(s.charAt(i)=='('){
                    open++;
                }else{
                    close++;
                }
                if(close>open){
                    op++;
                    close--;
                }
            }
            System.out.println(op);
        }
    }
}