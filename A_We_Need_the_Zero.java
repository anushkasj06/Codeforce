import java.util.*;

public class A_We_Need_the_Zero{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            int xor_sum =0;
            for(int i=0;i<n;i++){
                xor_sum ^= arr[i];
            }
            if(n%2!=0){
                System.out.println(xor_sum);
            }else{
                if(xor_sum == 0){
                    System.out.println(0);
                }else{
                    System.out.println(-1);
                }
            }
        }
    }
}