import java.util.*;

public class B_Sort_the_Subarray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] a1 = new int[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            for(int i=0;i<n;i++){
                a1[i] = sc.nextInt();
            }
            int first = -1, second =-1, first1 = -1, second1 =-1;
            for(int i=0;i<n;i++){
                if(a[i]!=a1[i]){
                    first =i;
                    break;
                }
            }
            for(int i=n-1;i>=0;i--){
                if(a[i]!=a1[i]){
                    second =i;
                    break;
                }
            }
            for(int i=first;i>0;i--){
                if(a1[i]>=a1[i-1]){
                    first1 = i-1;
                }else{
                    break;
                }
            }
            for(int i=second;i<n-1;i++){
                if(a1[i]<=a1[i+1]){
                    second1 = i+1;
                }else{
                    break;
                }
            }
            if(first1!=-1){
                System.out.print(first1+1);
            }else{
                System.out.print(first+1);
            }
            System.out.print(" ");
            if(second1!=-1){
                System.out.print(second1+1);
            }else{
                System.out.print(second+1);
            }
            System.out.println();
        }
    }
}