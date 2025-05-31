public class leetcode_1945 {
    public static void main(String[] args) {
        leetcode_1945 test = new leetcode_1945();
        System.out.println(test.getLucky("leetcode", 2));
        System.out.println(test.getLucky("iiii", 1));
        System.out.println(test.getLucky("zbax", 2));
    }
    public int getLucky(String s, int k) {
        StringBuilder news = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            news.append(c - 'a' + 1);
        }

        String numStr = news.toString();
        while (k-- > 0) {
            int sum = 0;
            for (char ch : numStr.toCharArray()) {
                sum += ch - '0';  // Convert digit char to integer
            }
            numStr = String.valueOf(sum);
        }

        return Integer.parseInt(numStr);
    }
}
