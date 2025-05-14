import java.util.*;

public class A_Trippi_Troppi{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s = sc.nextLine();
            String[] arr = s.split(" ");
            StringBuilder sb = new StringBuilder();
            for(String str : arr){
                char ch = str.charAt(0);
                sb.append(ch);
            }
            System.out.println(sb.toString().toLowerCase());
        }
    }
}