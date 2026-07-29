class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        int case1 = robRange(0,nums,n-2);
        int case2 = robRange(1,nums,n-1);
        return Math.max(case1, case2);
    }

    private int robRange(int start, int[] nums, int end){
        int prev2 = 0;
        int prev1 = 0;

        for(int i = start;i <= end; i++){
            int current = Math.max(prev1,prev2 + nums[i]);
            prev2 = prev1;
            prev1 = current;
        }
        return prev1;
    }
}