import java.util.*;

public class B_Multiply_by_2_divide_by_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int a=0, b=0;
            while(n%2==0){
                n /= 2;
                a++;
            }
            while(n%3==0){
                n /= 3;
                b++;
            }
            if(n==1 && a<=b){
                System.out.println(2*b-a);
            }else{
                System.out.println(-1);
            }
        }
    }
}