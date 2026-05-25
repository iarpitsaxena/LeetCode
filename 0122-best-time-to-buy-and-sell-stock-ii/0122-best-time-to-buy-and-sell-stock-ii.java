class Solution {
    Integer[][] dp;
    public int maxProfit(int[] prices) {
        dp = new Integer[prices.length][2];
        return solve(prices, 0, 0);
    }
    private int solve(int[] prices, int i, int holding){
        if(i == prices.length) return 0;
        if(dp[i][holding]!= null){
            return dp[i][holding];
        }
        int skip = solve(prices,i+1,holding);
        if(holding==1){
            int sell = prices[i] + solve(prices,i+1,0);
            return dp[i][holding] = Math.max(skip, sell);
        }
        else{
            int buy = -prices[i] + solve(prices, i + 1, 1);
            return dp[i][holding] = Math.max(skip,buy);
        }
    }
}