import java.util.*;

public class A_Johnny_and_Ancient_Computer{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            if(a>b){
                long temp = a;
                a = b;
                b = temp;
            }
            long op=0;
            while(a<=b){
                if(a*8<=b){
                    a*=8;
                    op++;
                }
                else if(a*4<=b){
                    a*=4;
                    op++;
                }
                else if(a*2<=b){
                    a*=2;
                    op++;
                }
                else{
                    break;
                }
            }
            if(a==b){
                System.out.println(op);
            }else{
                System.out.println(-1);
            }
        }
        sc.close();
    }
}