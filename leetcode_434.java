public class leetcode_434 {
    public int countSegments(String s) {
        if (s == null || s.trim().isEmpty()) {
            return 0;
        }
        String[] segments = s.trim().split("\\s+");
        return segments.length;
    }
    public static void main(String[] args) {
        leetcode_434 solution = new leetcode_434();
        String s = "Hello, my name is John";
        int result = solution.countSegments(s);
        System.out.println(result); // Output: 5
    }
}
