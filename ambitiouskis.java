import java.util.*;

public class ambitiouskis {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int min = Integer.MAX_VALUE;

            for(int i=0;i<n;i++){
                int x = in.nextInt();
                int diff = Math.abs(0-x);
                min = Math.min(min, diff);
            }
            
            System.out.println(min);
        
    }
}
