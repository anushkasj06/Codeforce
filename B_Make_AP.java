import java.util.*;

public class B_Make_AP{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            if(((2*b-c)>0 && (2*b-c)%a==0)||((a+c)%2==0 && ((a+c)/2)%b==0)||((2*b-a)>0 && (2*b-a)%c==0)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}