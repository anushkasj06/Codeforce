import java.util.Scanner;

public class A_SquareYear{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases
        while (t-- > 0) {
            String s = sc.next(); // 4-digit string

            int year = Integer.parseInt(s);
            boolean found = false;

            for (int i = 1; i < 4; i++) {
                int a = Integer.parseInt(s.substring(0, i));
                int b = Integer.parseInt(s.substring(i));

                int sum = a + b;
                if (sum * sum == year) {
                    System.out.println(a + " " + b);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("-1");
            }
        }
        sc.close();
    }
}
