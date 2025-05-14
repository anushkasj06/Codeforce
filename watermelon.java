import java.util.*;

public class watermelon{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int weight = in.nextInt();
        if(weight%2==0){
            if(weight==2){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }else{
            System.out.println("NO");
        }
    }
}