import java.io.*;
import java.util.*;

public class B_Permutation_Swap{
    public static void main(String[] args) throws IOException {
        // Fast input and output
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();

        int t = Integer.parseInt(br.readLine()); // Number of test cases
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine()); // Length of the permutation
            String[] input = br.readLine().split(" ");
            long ans = 0;

            for (int i = 1; i <= n; i++) {
                int b = Integer.parseInt(input[i - 1]);
                if (Math.abs(b - i) != 0) {
                    ans = gcd(ans, Math.abs(b - i));
                }
            }

            output.append(ans).append("\n");
        }

        System.out.print(output);
    }

    // Function to compute GCD of two numbers
    private static long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}