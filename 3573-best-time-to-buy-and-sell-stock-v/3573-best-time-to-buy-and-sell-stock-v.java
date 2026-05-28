class Solution {

    public long maximumProfit(int[] prices, int k) {

        int n = prices.length;

        long NEG = -(long)1e18;

        long[][][] dp =
            new long[n + 1][k + 1][3];

        // base cases
        for (int cap = 0; cap <= k; cap++) {

            dp[n][cap][0] = 0;

            dp[n][cap][1] = NEG;

            dp[n][cap][2] = NEG;
        }

        for (int i = n - 1; i >= 0; i--) {

            for (int cap = 1; cap <= k; cap++) {

                // state 0
                dp[i][cap][0] = Math.max(

                    dp[i + 1][cap][0],

                    Math.max(
                        -prices[i]
                        + dp[i + 1][cap][1],

                        prices[i]
                        + dp[i + 1][cap][2]
                    )
                );

                // state 1
                dp[i][cap][1] = Math.max(

                    dp[i + 1][cap][1],

                    prices[i]
                    + dp[i + 1][cap - 1][0]
                );

                // state 2
                dp[i][cap][2] = Math.max(

                    dp[i + 1][cap][2],

                    -prices[i]
                    + dp[i + 1][cap - 1][0]
                );
            }
        }

        return dp[0][k][0];
    }
}