import java.util.Scanner;

public class A_Square_Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            String ystr = sc.next(); // 4-digit string (may include leading 0s)
            int y = Integer.parseInt(ystr); // convert to number

            int s = (int) (Math.sqrt(y) + 0.5); // nearest integer to sqrt(y)

            if ((long) s * s != y || s > 99) {
                System.out.println(-1);
            } else {
                System.out.println(0 + " " + s);
            }
        }
        sc.close();
    }
}
