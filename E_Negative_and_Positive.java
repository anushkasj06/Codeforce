import java.util.*;

public class E_Negative_and_Positive{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int count = 0;
            for(int i = 1; i <= n; i++){
                if(i % 2 == 0){ // even numbers
                    count++;
                } else { // odd numbers
                    count--;
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}