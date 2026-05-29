class Solution {
    public long maximumProfit(int[] prices, int k) {
        long NEG = -(long)1e18;
        long[][] ahead = new long[k+1][3];
        long[][] curr = new long[k+1][3];
        for(int cap = 0; cap<=k;cap++){
            ahead[cap][0] = 0;
            ahead[cap][1] = NEG;
            ahead[cap][2] = NEG;
        }        
        for(int i =prices.length - 1;i>=0;i--){
            for(int cap = 1;cap<=k;cap++){
                curr[cap][0] = Math.max(ahead[cap][0], Math.max(-prices[i] + ahead[cap][1], prices[i]+ ahead[cap][2]));
                curr[cap][1] = Math.max(ahead[cap][1], prices[i] + ahead[cap-1][0]);
                curr[cap][2] = Math.max(ahead[cap][2], -prices[i] + ahead[cap-1][0]);
            }
            ahead = curr;
            curr = new long[k+1][3];
        }
        return ahead[k][0];
    }
}