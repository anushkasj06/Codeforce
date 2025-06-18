import java.util.*;

public class B_Above_the_Clouds{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            String s = sc.next();
            int[] freq = new int[26];
            for(int i=0;i<n;i++){
                freq[s.charAt(i)-'a']++;
            }

            boolean found = false;
            for(int i=1;i<=n-2;i++){
                if(freq[s.charAt(i)-'a']>=2){
                    found = true;
                    break;
                }
            }
            if(found){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
            
        }
    }
}