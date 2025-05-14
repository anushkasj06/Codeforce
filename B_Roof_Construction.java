import java.util.*;

public class B_Roof_Construction{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            int k =-1;
            int a = n-1;
            while(a>0){
                a=a/2;
                k++;
            }

            for(int i = n-1;i>=(1<<k);i--){
                System.out.print(i+" ");

            }

            for(int i=0;i<(1<<k);i++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        sc.close();

    }
}