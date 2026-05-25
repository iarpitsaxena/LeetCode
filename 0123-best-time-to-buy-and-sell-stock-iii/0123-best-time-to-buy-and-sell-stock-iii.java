class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[][][] dp = new int[n+1][2][3];
        for(int i = n-1;i>=0;i--){
            for(int hold = 0;hold<=1;hold++){
                for(int cap = 1;cap<=2;cap++){
                    int skip = dp[i+1][hold][cap];
                    if(hold == 1){
                        int sell = prices[i] + dp[i+1][0][cap-1];
                        dp[i][hold][cap] = Math.max(skip, sell);
                    } else{
                        int buy = -prices[i] + dp[i+1][1][cap];
                        dp[i][hold][cap] = Math.max(skip,buy);
                    }
                }
            }
        }
        return dp[0][0][2];    
    }
}