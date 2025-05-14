import java.util.*;

public class arraymul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int mul =1;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            mul *= arr[i];
        }

        for(int i = 0; i < n; i++) {
            int ans = mul / arr[i];
            arr[i] = ans;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();


    }
}