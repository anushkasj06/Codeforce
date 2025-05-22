public class leetcode_461 {
    public static int hammingDistance(int x, int y) {
        int xor = x ^ y; // XOR the two numbers
        int distance = 0;

        // Count the number of set bits in the XOR result
        while (xor > 0) {
            distance += xor & 1; // Increment distance if the last bit is set
            xor >>= 1; // Right shift to check the next bit
        }

        return distance;
    }
    
    public static void main(String[] args) {
        int x = 1;
        int y = 4;
        int result = hammingDistance(x, y);
        System.out.println(result); // Output: 2
    }
}
