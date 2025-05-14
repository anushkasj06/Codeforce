import java.util.*;

public class B_Different_Divisors {
    
    // Function to find the next prime number >= x
    public static int nextPrime(int x) {
        if (x <= 2) return 2;
        if (x % 2 == 0) x++; // Ensure x is odd for optimization
        
        while (true) {
            boolean isPrime = true;
            for (int j = 2; j * j <= x; j++) {  // Only check up to sqrt(x)
                if (x % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) return x;
            x += 2; // Skip even numbers
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // Number of test cases
        
        while (t-- > 0) {
            int d = sc.nextInt();  // Given integer d
            
            int p = nextPrime(1 + d);  // First prime >= (1 + d)
            int q = nextPrime(p + d);  // Second prime >= (p + d)

            long result1 = (long) p * q;  // Avoid integer overflow
            long result2 = (long) p * p * p;

            System.out.println(Math.min(result1, result2));
        }
        sc.close();
    }
}
