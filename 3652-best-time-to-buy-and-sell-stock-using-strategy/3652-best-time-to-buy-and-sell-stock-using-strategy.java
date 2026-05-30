class Solution {
    public long maxProfit(int[] prices, int[] strategy, int k) {
        int n = prices.length;
        long[] s = new long[n+1];// stores cumulative profit distribution
        long[] t = new long[n+1];// stores cumulative prices

        for(int i = 1;i <=n;i++){
            s[i] = s[i-1] + (long)prices[i-1] * strategy[i-1];
            t[i] = t[i-1] + prices[i-1];
        }
        long ans = s[n];

        for(int i = k;i<=n;i++){ // i represents window ending position + 1
        long candidate = s[n] - (s[i] - s[i-k]) + (t[i] - t[i-k/2]);
        ans = Math.max(ans,candidate);
        }
        return ans;
    }
}