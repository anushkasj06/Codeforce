public class leetcode_476 {
    public static int findComplement(int num) {
        if (num == 0) return 1;

        int bitLength = Integer.toBinaryString(num).length();
        
        int mask = (1 << bitLength) - 1;
        
        return num ^ mask; // XOR with the mask minus one
    }
    public static void main(String[] args) {
        System.out.println(findComplement(5));

    }
}
