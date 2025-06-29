import java.util.*;

public class C_Make_Them_Equal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();  // Number of test cases

        while (t-- > 0) {
            solve(sc);        
        }

        sc.close();
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();  // Size of the array
        char c = sc.next().charAt(0);  // Character to be checked
        String s = sc.next();  // String to be checked
        boolean found = true;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != c) {
                found = false;
                break;
            }
        }

        if(found) {
            System.out.println(0);
            return;
        }

        int val=-1;
        for (int i = 2; i <=n; i++) {
            boolean isposs = true;
            for(int j = i;j<=n;j+=i){
                if(s.charAt(j-1)!=c){
                    isposs = false;
                    break;
                }
            }
            if(isposs) {
                val = i;
                break;
            }
        }

        if(val != -1) {
            System.out.println(1);
            System.out.println(val);
            return;
        } 

        System.out.println(2);
        System.out.println((n-1)+ " " + (n));

    }
}