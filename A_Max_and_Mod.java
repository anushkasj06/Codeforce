import java.util.*;

public class A_Max_and_Mod {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            if(n%2==0){
                System.out.println(-1);
            }else{
                System.out.print(n+" ");
                for(int i=1;i<n;i++){
                    System.out.print(i+" ");
                }
                System.out.println();
            }
        }
        in.close();
    }
}