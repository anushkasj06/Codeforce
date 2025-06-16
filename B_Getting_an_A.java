import java.util.*;

public class B_Getting_an_A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum =0;

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        int count =0;

        Arrays.sort(arr);
        
        if(sum*10 >= n*45){
            System.out.println(0);
        }else{
            for(int i=0;i<n;i++){
                sum = sum +5 - arr[i];
                count++;
                if(sum*10 >= n*45){
                    System.out.println(count);
                    break;
                }
            }

        }

    }
}