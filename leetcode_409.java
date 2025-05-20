public class leetcode_409 {
    public static int longestPalindrome(String s) {
        int[] charCount = new int[128];
        for (char c : s.toCharArray()) {
            charCount[c]++;
        }

        int length = 0;
        boolean hasOdd = false;

        for (int count : charCount) {
            if (count % 2 == 0) {
                length += count;
            } else {
                length += count - 1;
                hasOdd = true;
            }
        }

        return length + (hasOdd ? 1 : 0);

    }

    public static void main(String[] args) {
        String s = "abccccdd";
        System.out.println(longestPalindrome(s));

    }
}
