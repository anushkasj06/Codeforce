import java.util.*;

public class A_New_World_New_Me_New_Array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n =  sc.nextInt();
            int k = sc.nextInt();
            int p = sc.nextInt();
            int count = 0;
            while(k>0 && n>0){
                k-=p;
                n--;
                count++;
            }
            if(k>p){
                System.out.println(-1);
            }else{
                System.out.println(count);
            }
        }

    }
}