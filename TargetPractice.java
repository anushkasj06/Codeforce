import java.util.*;

public class TargetPractice{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt(); // Number of test cases
        in.nextLine(); // Consume the newline

        while (t-- > 0) {
            int totalScore = 0;

            for (int i = 0; i < 10; i++) {
                String row = in.nextLine(); // Read each row
                for (int j = 0; j < 10; j++) {
                    if (row.charAt(j) == 'X') {
                        // Find the minimum distance to any edge
                        int ring = Math.min(Math.min(i, 9 - i), Math.min(j, 9 - j)) + 1;
                        totalScore += ring;
                    }
                }
            }
            System.out.println(totalScore);
        }
        in.close();
    }
}
