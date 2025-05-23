import java.util.HashMap;

public class leetcode_387 {
    public int firstUniqChar(String s) {
       HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.get(ch) == 1) {
                return i;
            }
        }

        return -1;
        
    }

    public static void main(String[] args) {
        leetcode_387 solution = new leetcode_387();
        String s = "leetcode";
        System.out.println(solution.firstUniqChar(s)); // Output: 0
    }
}
