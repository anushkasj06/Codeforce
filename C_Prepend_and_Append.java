import java.util.*;


public class C_Prepend_and_Append{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String s = sc.next();
            int i =0;
            int j = s.length()-1;
            int count =0;
            while(i<j && s.charAt(i) != s.charAt(j)){
                i++;
                j--;
                count++;
            }
            int ans = n - 2*count;
            System.out.println(ans);
        
        }
    }
}