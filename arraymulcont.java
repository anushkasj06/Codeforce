import java.util.*;

public class arraymulcont{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] arr1 = new int[n];
        for(int i = 0; i < n; i++) {
            int mul = 1;
            for (int j = 0; j < n; j++) {
                if (i ==j) {
                    continue;
                } else {
                    mul *= arr[j];
                }
            }
            arr1[i] = mul;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
    }
}