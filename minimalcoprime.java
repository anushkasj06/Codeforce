import java.util.Scanner;

public class minimalcoprime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int l = in.nextInt();
            int r = in.nextInt();

            if(l==1 && r==1){
                System.out.println(1);
            }else{
                System.out.println(r-l);
            }
        }
    }
}
