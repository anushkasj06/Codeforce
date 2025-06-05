import java.util.*;

public class A_Three_Decks{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int sum  = a+b+c;
            int d = sum/3;
            if(sum%3==0){
                if(d<a || d<b ){
                    System.out.println("NO");
                }else{
                    System.out.println("YES");
                }
            }else{
                System.out.println("NO");
            }
            
        }
    }
}