public class leetcode_1974 {
    public static void main(String[] args) {
        leetcode_1974 sol = new leetcode_1974();
        System.out.println(sol.minTimeToType("zjpc"));
    }
    public int minTimeToType(String word) {
        int count=0;
        char start = 'a';
        for(char c : word.toCharArray()){
            count += Math.min(Math.abs(start-c), 26-Math.abs(start-c));
            start = c;
        }
        count += word.length();
        return count;
    }
}
