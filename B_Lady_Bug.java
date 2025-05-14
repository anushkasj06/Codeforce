import java.util.Scanner;

public class B_Lady_Bug{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        while (t-- > 0) {
            int n = Integer.parseInt(sc.nextLine());
            String a = sc.nextLine().trim();
            String b = sc.nextLine().trim();

            int comp1Ones = 0;
            int comp1BCount = 0;
            int comp2Ones = 0;
            int comp2BCount = 0;

            for (int i = 0; i < n; i++) {
                // i is 0-indexed
                if (i % 2 == 0) {
                    if (a.charAt(i) == '1') {
                        comp1Ones++;
                    }
                } else {
                    if (a.charAt(i) == '1') {
                        comp2Ones++;
                    }
                }
            }

            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    comp2BCount++;
                    if (b.charAt(i) == '1') {
                        comp2Ones++;
                    }
                } else {
                    comp1BCount++;
                    if (b.charAt(i) == '1') {
                        comp1Ones++;
                    }
                }
            }

            if (comp1Ones <= comp1BCount && comp2Ones <= comp2BCount) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
