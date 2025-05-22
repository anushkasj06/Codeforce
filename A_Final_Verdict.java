import java.util.*;


public class A_Final_Verdict{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0){
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            int sum=0;
            for(int i=0;i<n;i++){
                int a = scanner.nextInt();
                sum+=a;
            }
            if(sum== x*n){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}