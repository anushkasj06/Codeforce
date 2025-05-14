import java.util.Scanner;

public class A_Kamilka_and_the_Sheep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(); 
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int maxDiff = 0;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    int diff = Math.abs(a[i] - a[j]);
                    if (diff > maxDiff) {
                        maxDiff = diff;
                    }
                }
            }

            System.out.println(maxDiff);
        }

        sc.close();
    }
}
