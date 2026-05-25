class Solution {
    public int maxProfit(int[] prices) {
        int cash = 0;
        int hold = -prices[0];
        for(int i = 0;i < prices.length;i++){
            int prevCash = cash;
            cash = Math.max(cash, hold + prices[i]);
            hold = Math.max(hold, prevCash - prices[i]);
        }
        return cash;
    }
}