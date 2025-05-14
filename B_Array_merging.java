import java.util.*;

public class B_Array_merging {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            long n = sc.nextInt();
            int[] a = new int[(int)n];
            int[] b = new int[(int)n];

            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }

            for(int i=0;i<n;i++){
                b[i] = sc.nextInt();
            }

            int[] fa = new int[(int)(2*n+1)];
            int[] fb = new int[(int)(2*n+1)];

            Arrays.fill(fa, 0);
            Arrays.fill(fb, 0);

            for(int i=0;i<n;i++){
                long val = a[i];
                long cnt =0;
                while(i<n && a[i]==val){
                    cnt++;
                    i++;
                }
                i--;
                fa[(int)val] = Math.max((int)fa[(int)val], (int)cnt);
            }

            for(int i=0;i<n;i++){
                long val = b[i];
                long cnt =0;
                while(i<n && b[i]==val){
                    cnt++;
                    i++;
                }
                i--;
                fb[(int)val] = Math.max((int)fb[(int)val],(int) cnt);
            }

            long ans =0;
            for(int i=1;i<=2*n;i++){
                ans = Math.max(ans, fa[i]+fb[i]);
            }
            System.out.println(ans);

           
        }
    }
}