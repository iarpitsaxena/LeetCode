class Solution {
    Integer[][][] dp;
    public int maxProfit(int[] prices) {
        int n = prices.length;
        dp = new Integer[n][2][3];
        return solve(prices,0,0,2);
    }
    private int solve(int[] prices, int i, int hold, int cap){
        if(i == prices.length || cap == 0) return 0;
        if(dp[i][hold][cap]!= null) return dp[i][hold][cap];
        int skip = solve(prices, i + 1, hold, cap);
        if(hold == 1){
            int sell = prices[i] + solve(prices,i +1,0,cap - 1);
            return dp[i][hold][cap] = Math.max(sell, skip);
        } else 
        {
            int buy = -prices[i] + solve(prices, i+1, 1, cap);
            return dp[i][hold][cap] = Math.max(buy,skip);
        }
    }
}