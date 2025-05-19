public class leetcode_405 {
    public static String toHex(int num) {
        if(num == 0) return "0";
        StringBuilder sb = new StringBuilder();
        char[] hexChars = "0123456789abcdef".toCharArray();
        while(num != 0 && sb.length() < 8){
            sb.append(hexChars[num & 15]);
            num >>>= 4;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        int num = -1;
        System.out.println(toHex(num));
    }
}
