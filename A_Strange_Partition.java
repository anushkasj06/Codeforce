import java.util.*;

public class A_Strange_Partition{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            int sum =0;
            int max_b = 0;
            for(int i=0;i<n;i++){
                if(arr[i]%x==0){
                    max_b += (arr[i])/x;
                }else{
                    max_b += (arr[i])/x+1;
                }
                sum+= arr[i];
            }

            int min_b=0;
            if(sum%x==0){
                min_b = sum/x;
            }else{
                min_b = (sum/x)+1;
            }
            System.out.println(min_b+" "+max_b);

        }
    }
}