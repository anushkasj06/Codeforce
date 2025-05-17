import java.util.*;

public class A_Serval_and_Mocha_s_Array {
    public static int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        return gcd(b, a % b);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0){
            int n = scanner.nextInt();
            int a[] = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = scanner.nextInt();
            }
            boolean found = false;

            for(int i=0;i<n;i++){
                for(int j=i;j<n;j++){
                    if(gcd(a[i],a[j])<=2){
                        found = true;
                        break;
                    }
                }
            }

            if(found){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

    }
}