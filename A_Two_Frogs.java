import java.util.*;


public class A_Two_Frogs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a%2 != b%2 || n==2){
                System.out.println("NO");
            }else{
                if(a==1 & b==2){
                    System.out.println("NO");
                }else if(a==n && b==n-1){
                    System.out.println("NO");
                }else{
                    System.out.println("YES");
                }
            }
        }
    }

    
}