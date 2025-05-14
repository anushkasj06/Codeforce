import java.util.*;

public class gamewithint {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            if(n%3==0){
                System.out.println("Second");
            }else{
                System.out.println("First");
            }
        }
    }
}
