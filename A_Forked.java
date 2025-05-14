import java.util.*;

public class A_Forked{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long xk = sc.nextLong();
            long yk = sc.nextLong();
            long xq = sc.nextLong();
            long yq = sc.nextLong();
            int ans =0;

            if(a==b){
                long[] dx = {-a,-a,a,a};
                long[] dy = {b,-b,b,-b};
                for(int i=0;i<4;i++){
                    for(int j=0;j<4;j++){
                        int kpos_kx = (int)(xk+dx[i]);
                        int kpos_ky = (int)(yk+dy[i]);
                        int kpos_qx = (int)(xq+dx[j]);
                        int kpos_qy = (int)(yq+dy[j]);
                        if(kpos_kx==kpos_qx && kpos_ky==kpos_qy){
                            ans++;
                        }
                    }
                }
            }else{
                long[] dx = {-a,-a,a,a,b,b,-b,-b};
                long[] dy = {b,-b,b,-b,a,-a,a,-a};
                for(int i=0;i<8;i++){
                    for(int j=0;j<8;j++){
                        int kpos_kx = (int)(xk+dx[i]);
                        int kpos_ky = (int)(yk+dy[i]);
                        int kpos_qx = (int)(xq+dx[j]);
                        int kpos_qy = (int)(yq+dy[j]);
                        if(kpos_kx==kpos_qx && kpos_ky==kpos_qy){
                            ans++;
                        }
                    }
                }
            }
            System.out.println(ans);

        }
    }
}