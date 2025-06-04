import java.util.*;

public class B_Down_with_Brackets {
    public static void solve(Scanner sc) {
        String s = sc.next();
        int open =0;
        boolean bol = false;
        for(char ch:s.toCharArray()){
            if(open==0  && bol){
                System.out.println("YES");
                return;
            }
            if(ch=='('){
                open++;
            }
            if(ch==')'){
                open--;
            }
            bol = true;
        }
        System.out.println("NO");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
           solve(sc);

        }
    }
}
