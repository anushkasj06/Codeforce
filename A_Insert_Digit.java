import java.util.*;

public class A_Insert_Digit{
    public static void solve(Scanner sc) {
        int n = sc.nextInt();
            int d = sc.nextInt();
            String s = sc.next();
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)-'0' >=d){
                    System.out.print(s.charAt(i));
                }else{
                    System.out.print(d);
                    for(int j=i;j<s.length();++j){
                        System.out.print(s.charAt(j));
                    }
                    System.out.println();
                    return;
                }
            }
            System.out.println(d);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }
}