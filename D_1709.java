import java.util.*;

public class D_1709{
    public static void solve(int n,int[] a,int[] b){
        StringBuilder sb = new StringBuilder();
        int count =0;
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<i;j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    sb.append("1").append(" ").append(j+1).append("\n");
                    count++;
                }
            }
        }

        for(int i=n-1;i>=0;i--){
            for(int j=0;j<i;j++){
                if(b[j]>b[j+1]){
                    int temp = b[j];
                    b[j] = b[j+1];
                    b[j+1] = temp;
                    sb.append("2").append(" ").append(j+1).append("\n");
                    count++;
                }
            }
        }

        for(int i=0;i<n;i++){
            if(a[i]>b[i]){
                sb.append("3").append(" ").append(i+1).append("\n");
                count++;
            }
        }

        System.out.println(count);
        if(count==0){
            return;
        }
        System.out.print(sb.toString());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            for(int i=0;i<n;i++){
                b[i] = sc.nextInt();
            }
            solve(n,a,b);

        }
        sc.close();
    }
}