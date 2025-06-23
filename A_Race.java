import java.util.*;

public class A_Race{
    public static void solve(Scanner sc){
        int a = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        int alice1 = Math.abs(x-a);
        int alice2 = Math.abs(y-a);
        boolean found = false;
        for(int i=1;i<=100;i++){
            if(i==a){
                continue;
            }
            int bob1 = Math.abs(i-x);
            int bob2 = Math.abs(i-y);
            if(bob1<alice1 && bob2<alice2){
                found = true;
                break;
            }
        }
        if(found){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            solve(sc);
        }
    }
}