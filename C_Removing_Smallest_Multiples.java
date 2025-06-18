import java.util.*;

public class C_Removing_Smallest_Multiples{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            String s = sc.next();
            char[] arr = s.toCharArray();
            long ans = 0;
            StringBuilder marked = new StringBuilder();
            for (int i = 0; i < n; i++) {
                marked.append('1');
            }
            char[] markedarr = marked.toString().toCharArray();
            for(int i=0;i<n;i++){
                if(arr[i]=='0'){
                    for(int j = i+1;j<=n;j+=i+1){
                        if(arr[j-1]=='1'){
                            break;
                        }
                        if(markedarr[j-1]=='0'){
                            continue;
                        }
                        markedarr[j-1] = '0';
                        ans+=i+1;
                    }
                }
            }
            System.out.println(ans);
        }
    }
}