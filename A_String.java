import java.util.*;

public class A_String{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t= in.nextInt();
        while (t-->0) {
            String s = in.next();
            int countone =0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='1'){
                    countone++;
                }
            }
            System.out.println(countone);
        }
    }
}