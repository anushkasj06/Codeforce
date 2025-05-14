import java.util.*;

public class B_Chemistry{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();
            int[] arr = new int[26];
            for(int i=0;i<n;i++){
                arr[s.charAt(i)-'a']++;
            }
            int oddcount=0;
            for(int i=0;i<26;i++){
                if(arr[i]%2!=0){
                    oddcount++;
                }
            }

            if(k>= (oddcount-1)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}