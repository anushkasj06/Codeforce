import java.util.Scanner;

public class A_Ideal_Generator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // number of test cases

        while (t-- > 0) {
            int k = sc.nextInt();
            if (k % 2 == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
