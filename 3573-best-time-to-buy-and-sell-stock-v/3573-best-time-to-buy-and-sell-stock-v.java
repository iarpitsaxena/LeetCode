class Solution {
    Long[][][] dp;
    long NEG = -(long)1e18;
    public long maximumProfit(int[] prices, int k) {
        int n = prices.length;
        dp = new Long[n][k+1][3];
        return dfs(0,k,0, prices);
    }
    private long dfs(int i, int cap, int state, int[] prices){
        if(i == prices.length ||  cap == 0){
            return state == 0?0: NEG;
        }
        if(dp[i][cap][state]!=null) return dp[i][cap][state];

        long skip = dfs(i+1, cap, state, prices);
        long ans = skip;
        if(state == 0){
            long buy = -prices[i] + dfs(i+1, cap, 1, prices);
            long shortSell = prices[i] + dfs(i+1, cap, 2, prices);
            ans = Math.max(skip, Math.max(buy,shortSell));
        }
        else if(state == 1){
            long sell = prices[i] + dfs(i+1, cap - 1, 0,prices);
            ans = Math.max(skip, sell);
        } else{
            long buyBack = -prices[i] + dfs(i+1, cap - 1, 0, prices);
            ans = Math.max(skip, buyBack);
        }
        return dp[i][cap][state] = ans;
    }
}