import java.util.*;

public class B_Kalindrome_Array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            if(iskalindrome(sc)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }

    }

    private static boolean iskalindrome(Scanner sc){
        int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int l =0;
            int r = n-1;
            while(l<r){
                if(arr[l] == arr[r]){
                    l++;
                    r--;
                }else{
                    return skipvalue(arr,l,r, arr[l]) || skipvalue(arr,l,r,arr[r]);
                }
            }
            return true;
    }

    private static boolean skipvalue(int[] arr, int l, int r, int skip_value){
        while(l<r){
            if(arr[l] == skip_value){
                l++;
            }else if(arr[r] == skip_value){
                r--;
            }else if(arr[l] == arr[r]){
                l++;
                r--;
            }else{
                return false;
            }
        }
        return true;
    }
}