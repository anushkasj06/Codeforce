import java.util.*;

public class A_One_and_Two {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        while(t-->0){
            int n = scanner.nextInt();
            int a[] = new int[n+1];
            int r_count =0;
            for(int i = 1; i <=n; i++){
                a[i] = scanner.nextInt();
                if(a[i]==2){
                    r_count++;
                }
            }
            int l_count =0;
            boolean found = false;
            for(int i = 1; i < n; i++){
                if(a[i] == 2){
                    l_count++;
                    r_count--;
                }
                if(l_count == r_count){
                    System.out.println(i);
                    found = true;
                    break;
                }
            }
            if(!found){
                System.out.println(-1);
            }
        }
    }
}