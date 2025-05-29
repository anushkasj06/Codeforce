public class leetcode_482 {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder cleaned = new StringBuilder();
        

        for (char c : s.toCharArray()) {
            if (c != '-') {
                cleaned.append(Character.toUpperCase(c));
            }
        }


        StringBuilder result = new StringBuilder();
        int count = 0;

        for (int i = cleaned.length() - 1; i >= 0; i--) {
            result.append(cleaned.charAt(i));
            count++;
            if (count == k && i != 0) {
                result.append('-');
                count = 0;
            }
        }


        return result.reverse().toString();
    }
    public static void main(String[] args) {
        leetcode_482 solution = new leetcode_482();
        String s = "5F3Z-2e-9-w";
        int k = 4;
        String formatted = solution.licenseKeyFormatting(s, k);
        System.out.println(formatted);
    }
}
