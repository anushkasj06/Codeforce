public class NumArray {
    private int[] sums;

    public NumArray(int[] nums) {
        sums = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            sums[i + 1] = sums[i] + nums[i];
        }
    }
    public int sumRange(int left, int right) {
        return sums[right + 1] - sums[left];
    }



    public static void main(String[] args) {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        
        NumArray numArray = new NumArray(nums);
        System.out.println(numArray.sumRange(0, 2)); // Output: 1
        System.out.println(numArray.sumRange(2, 5)); // Output: -1
        System.out.println(numArray.sumRange(0, 5)); // Output: -3

        
    }
}
