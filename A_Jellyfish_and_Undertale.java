import java.util.*;

public class A_Jellyfish_and_Undertale{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long a= sc.nextLong();
            long b= sc.nextLong();
            int n = sc.nextInt();
            long[] arr = new long[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextLong();
            }
            long timer = b-1;
            b = 1;
            for(int i=0;i<n;i++){
                b = Math.min(b+arr[i], a);
                timer += (b-1);
                b=1;
            }
            System.out.println(timer+b);


        }
    }
}