public class leetcode_541 {
    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 2;
        String result = reverseStr(s, k);
        System.out.println(result); // Output: "bacdfeg"
    }

    public static String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i += 2 * k) {
            reverse(chars, i, Math.min(i + k - 1, chars.length - 1));
        }
        return new String(chars);
    }

    private static void reverse(char[] chars, int left, int right) {
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
    }
}
