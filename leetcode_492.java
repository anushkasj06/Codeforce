public class leetcode_492 {
    public int[] constructRectangle(int area) {
        int w = (int) Math.sqrt(area);
        while (area % w != 0) {
            w--;
        }
        return new int[]{area / w, w};
    }
    public static void main(String[] args) {
        leetcode_492 solution = new leetcode_492();
        int area = 4; // Example area
        int[] result = solution.constructRectangle(area);
        System.out.println("Length: " + result[0] + ", Width: " + result[1]);
    }
}
