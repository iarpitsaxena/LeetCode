class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        int case1 = robRange(0,nums,n-2);
        int case2 = robRange(1,nums,n-1);
        return Math.max(case1, case2);
    }

    private int robRange(int start, int[] nums, int end){
        int length = end - start + 1;
        int[] dp = new int[length];
        dp[0] = nums[start];
        if(length > 1){
            dp[1] = Math.max(nums[start], nums[start + 1]);
        }
        for(int i = 2;i < length; i++){
            dp[i] = Math.max(dp[i-1],dp[i-2] + nums[start + i]);
        }
        return dp[length - 1];
    }
}