import java.util.HashMap;
import java.util.Map;

class Solution {

    Map<Integer, Integer> dp = new HashMap<>();

    public int minOperations(int n) {
        if (n == 0 || n == 1) return n;

        if (dp.containsKey(n)) return dp.get(n);

        int val = Integer.highestOneBit(n);
        if(n == val) {
            dp.put(n,1);
            return 1;
        }
        int ans = 1 + Math.min(
            minOperations(val * 2 - n),
            minOperations(n - val)
        );

        dp.put(n, ans);
        return ans;
    }
}
