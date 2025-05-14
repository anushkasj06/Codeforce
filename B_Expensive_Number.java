import java.util.*;

public class B_Expensive_Number{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-->0){
            String s = sc.next();
            int cnt =0;
            int b =0;
            for(char a : s.toCharArray()){
                if(a=='0'){
                    cnt++;
                }else{
                    b = Math.max(b,cnt+1);
                }
            }
            System.out.println(s.length()-b);
        }

    }
}