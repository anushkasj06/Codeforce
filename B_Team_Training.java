import java.util.*;

public class B_Team_Training{
    static void reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
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
            
            Arrays.sort(arr);
            reverseArray(arr);

            int team =0;
            int m = 0;
            int min = Integer.MAX_VALUE;

            for(int a: arr){
                m++;
                min = Math.min(min, a);
                if(m*min>=x){
                    team++;
                    m=0;
                    min = Integer.MAX_VALUE;
                }
                
            }
            System.out.println(team);


        }
        sc.close();



    }
}