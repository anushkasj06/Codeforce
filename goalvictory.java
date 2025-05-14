import java.util.*;

public class goalvictory {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt(); // Read number of test cases
        while (t-- > 0) {
            int n = in.nextInt(); // Read number of teams
            int sum = 0;
            for (int i = 0; i < n - 1; i++) {
                sum += in.nextInt(); // Read and sum the efficiencies
            }
            System.out.println(sum * -1); // Correct the logic by negating the sum
        }
        in.close(); // Close the scanner
    }
}
