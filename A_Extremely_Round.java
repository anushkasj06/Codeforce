import java.util.*;

public class A_Extremely_Round {
    static HashSet<Integer> candidate = new HashSet<>(); // made static

    public static boolean check(int n){
        int count = 0;
        while(n > 0){
            int d = n % 10;
            if(d != 0){
                count++;
            }
            n /= 10;
        }
        return count == 1;
    }

    public static void main(String[] args) {
        for(int i = 1; i < 1000000; i++){ // start from 1, since 0 is not considered
            if(check(i)){
                candidate.add(i);
            }
        }

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int count = 0;
            for(int i : candidate){
                if(i <= n){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
