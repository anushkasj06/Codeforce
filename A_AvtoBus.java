import java.util.*;

public class A_AvtoBus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases
        while (t-- > 0) {
            long n = sc.nextLong(); // Use nextLong for large values
            if (n < 4 || n % 2 != 0) { // Check if n is less than 4 or odd
                System.out.println(-1);
            } else {
                long min = (n + 5) / 6; // Minimum buses (ceil of n / 6)
                long max = n / 4;       // Maximum buses (floor of n / 4)
                System.out.println(min + " " + max);
            }
        }
        sc.close();
    }
}