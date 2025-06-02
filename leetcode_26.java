public class leetcode_26 {
    public int removeDuplicates(int[] nums) {
        int i=0;
        int j=0;
        int n = nums.length;
        while(j<n){
            while(nums[j]!=nums[i]){
                i++;
                nums[i]=nums[j];
            }
            j++;
            
        }
        return i+1;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        leetcode_26 obj = new leetcode_26();
        System.out.println(obj.removeDuplicates(nums));
    }
}
