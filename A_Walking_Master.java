import java.util.*;


public class A_Walking_Master{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long d = sc.nextLong();

            if(b>d){
                System.out.println(-1);
            }else{
                if((a+d-b)< c){
                    System.out.println(-1);
                }else{
                    System.out.println(2*(d-b)+a-c);
                }
            }
        }
    }
}