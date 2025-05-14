import java.util.*;

public class sequencegame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        while (t-- > 0) {
            int n = in.nextInt();
            int[] b = new int[n];

            for (int i = 0; i < n; i++) {
                b[i] = in.nextInt();
            }

            ArrayList<Integer> a = new ArrayList<>();
            a.add(b[0]);  // First element is always included

            for (int i = 1; i < n; i++) {
                if (b[i] < b[i - 1]) { 
                    a.add(b[i]);  // Insert previous value before decreasing
                }
                a.add(b[i]);  // Always add current value
            }

            System.out.println(a.size());
            for (int num : a) {
                System.out.print(num + " ");
            }
           
        }
        
        in.close();
    }
}
