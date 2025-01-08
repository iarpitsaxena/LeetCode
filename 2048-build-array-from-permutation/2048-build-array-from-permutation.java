class Solution {
    public int[] buildArray(int[] nums) {
        for(int i = 0;i < nums.length;i++){
            nums[i] += (nums[nums[i]]% nums.length) * nums.length;
        }
        for(int i = 0;i<nums.length;i++){
            nums[i]/=nums.length;
        }
        
        return nums;
    }
}

// will take O(1) space complixity