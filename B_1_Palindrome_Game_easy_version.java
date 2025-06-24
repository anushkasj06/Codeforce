import java.util.*;

public class B_1_Palindrome_Game_easy_version{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String s = sc.next();
            int zero =0;
            for(int i=0;i<n;i++){
                if(s.charAt(i)=='0'){
                    zero++;
                }
            
            }

            if(zero==0){
                System.out.println("DRAW");
            }else if(zero==1){
                System.out.println("BOB");
            }else if(zero%2==0){
                System.out.println("BOB");
            }else{
                System.out.println("ALICE");
            }
        }
    }
}