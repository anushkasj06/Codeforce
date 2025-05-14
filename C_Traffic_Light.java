import java.util.*;

public class C_Traffic_Light {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();  // Number of test cases
        while (t-- > 0) {
            int n = in.nextInt();  // Length of the string (not used)
            char c = in.next().charAt(0);  // The target character
            String s = in.next();  // Input string
            s = s + s;  // Concatenate the string with itself to handle circular cases
            int green_signal = s.length();  // Initialize green signal to an invalid index
            int ans = 0;

            // Loop from the end of the string to the beginning
            for (int i = s.length() - 1; i >= 0; i--) {
                if (s.charAt(i) == 'g') {
                    green_signal = i;  // Update the position of the latest green signal
                }
                if (s.charAt(i) == c) {
                    ans = Math.max(ans, green_signal - i);  // Calculate the maximum distance
                }
            }
            System.out.println(ans);
        }
        in.close();  // Close the scanner to prevent resource leak
    }
}
