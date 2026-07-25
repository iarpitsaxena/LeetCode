class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        return Math.min(solve(0, cost,dp),solve(1,cost,dp));
    }
    private int solve(int index, int[] cost, int[] dp){
        if(index >= cost.length) return 0;
        if(dp[index]!= -1) return dp[index];
        int oneStep = solve(index + 1, cost, dp);
        int twoStep = solve(index + 2, cost, dp);
        dp[index] = cost[index] + Math.min(oneStep, twoStep);
        return dp[index];
    }
}