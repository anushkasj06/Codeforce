import java.util.*;

public class A_Letter_Home{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int s = sc.nextInt();
            int[] arr = new int[n];
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
                min = Math.min(min,arr[i]);
                max = Math.max(max,arr[i]);
            }

            if(n==1){
                if(arr[0]==s){
                    System.out.println(0);
                    continue;
                }else{
                    int diff = Math.abs(arr[0]-s);
                    System.out.println(diff);
                    continue;
                }
            }else{
                if(s<min){
                    System.out.println(max-s);
                    continue;
                }else if(s>max){
                    System.out.println(s-min);
                    continue;
                }else{
                   int left = Math.abs(s - min);
                    int right = Math.abs(s - max);
                    System.out.println((max - min) + Math.min(left, right));
                    continue;
                }
            }

        }

    }
}