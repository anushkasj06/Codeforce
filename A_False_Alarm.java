import java.util.*;

public class A_False_Alarm{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int first1 = -1;
            int last1 = -1;
            for(int i = 0; i < n; i++) {
                if(a[i] == 1) {
                    if(first1 == -1) {
                        first1 = i;
                    }
                    last1 = i;
                }
            }
            int count = last1-first1+1;
            if(count <=x) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }
}
