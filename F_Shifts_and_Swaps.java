
import java.util.*;

public class F_Shifts_and_Swaps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // number of test cases

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[] a = new int[n];
            int[] b = new int[n];

            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            for (int i = 0; i < n; i++) b[i] = sc.nextInt();

            // Step 1: Find position where a matches b[0]
            List<Integer> matchingShifts = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                if (a[i] == b[0]) {
                    matchingShifts.add(i);
                }
            }

            boolean possible = false;

            for (int shift : matchingShifts) {
                if (isValidShift(a, b, shift)) {
                    possible = true;
                    break;
                }
            }

            System.out.println(possible ? "YES" : "NO");
        }
    }

    // Check if rotating a by shift and doing allowed swaps gives b
    private static boolean isValidShift(int[] a, int[] b, int shift) {
        int n = a.length;
        int[] rotated = new int[n];
        for (int i = 0; i < n; i++) {
            rotated[i] = a[(i + shift) % n];
        }

        // We simulate bubble swaps allowed by the problem
        // For positions where rotated[i] != b[i] and cannot be swapped, return false
        for (int i = 0; i < n - 1; i++) {
            if (rotated[i] != b[i]) {
                // Try swap if allowed
                if (rotated[i] != b[i] && rotated[i + 1] != b[i + 1] &&
                    Math.abs(rotated[i] - rotated[i + 1]) >= 2) {
                    // Perform swap
                    int temp = rotated[i];
                    rotated[i] = rotated[i + 1];
                    rotated[i + 1] = temp;
                    // Recheck i (might affect previous)
                    i = Math.max(-1, i - 2);
                } else {
                    return false; // Not swappable
                }
            }
        }

        return Arrays.equals(rotated, b);
    }
}
