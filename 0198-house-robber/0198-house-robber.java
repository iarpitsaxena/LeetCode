class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);

       return solve(nums, 0,dp);
    }
    private int solve(int[] nums, int i, int[] dp){
        if(i >= nums.length){
            return 0;
        }
        if(dp[i]!= -1) return dp[i];
        int skip = solve(nums,i+1,dp);
        int rob = solve(nums,i+2,dp) + nums[i];
        dp[i] =  Math.max(skip,rob);
        return dp[i];
    }
}