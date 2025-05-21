public class leetcode_459 {
    public static void main(String[] args) {
        String s = "abcabcabcabc";
        System.out.println(repeatedSubstringPattern(s));
    }

    public static boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for (int len = 1; len <= n / 2; len++) {
            if (n % len == 0) {
                String sub = s.substring(0, len);
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < n / len; i++) {
                    sb.append(sub);
                }
                if (sb.toString().equals(s)) {
                    return true;
                }
            }
        }
        return false;
    }
}
