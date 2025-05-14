import java.util.*;

public class B_Triangles_on_a_Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long w = sc.nextInt();
            long h = sc.nextInt();
            long area = 0;
           for(int i=0;i<4;i++){
            long k = sc.nextInt();
            long first=0;
            long second=0;
            for(int j=0;j<k;j++){
                long a = sc.nextInt();
                if(first==0){
                    first = a;
                }else{
                    second = a;
                }
            }
            if(i<=1){
                area = Math.max(area,(second-first)*h);
            }else{
                area = Math.max(area,(second-first)*w);
            }
           }
           System.out.println(area);
        }

        sc.close();
    }
}
