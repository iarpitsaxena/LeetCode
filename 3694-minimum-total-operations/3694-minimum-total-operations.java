class Solution {
    public int minOperations(int[] nums) {
        int count = 0;
        if(nums.length == 1) return 0;
        for(int i = nums.length - 2;i >=0;i--){
            if(nums[i]!=nums[i+1]){
                count++;
            }
        }
        return count;
    }
}