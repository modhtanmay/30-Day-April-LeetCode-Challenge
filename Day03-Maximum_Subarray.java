class Solution {
    public int maxSubArray(int[] nums) {
        int curr_max = nums[0];
        int sum_upto = nums[0];
        int size = nums.length;
        
        for(int i=1;i<size;i++){
            curr_max = Math.max(nums[i],curr_max+nums[i]);
            sum_upto = Math.max(sum_upto,curr_max);
        }
        return sum_upto;
    }
}
