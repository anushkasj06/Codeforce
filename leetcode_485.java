public class leetcode_485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }else{
                max = Math.max(max, count);
                count = 0;
            }
            if(i==nums.length-1){
                max = Math.max(max, count);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        leetcode_485 obj = new leetcode_485();
        int[] nums = {1, 1, 0, 1, 1, 1};
        System.out.println(obj.findMaxConsecutiveOnes(nums)); // Output: 3
    }
}
