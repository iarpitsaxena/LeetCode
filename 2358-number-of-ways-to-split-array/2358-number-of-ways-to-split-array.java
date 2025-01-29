class Solution {
    public static int waysToSplitArray(int[] nums) {
        int n = nums.length;
        long[] arr = new long[n];
        arr[0] = nums[0];
        for(int i = 1; i < n; ++i){
            arr[i] = nums[i] + arr[i-1];
        }
        int count = 0;
        for(int i = 0; i < n-1; ++i){
            long leftSum = arr[i];
            long rightSum = arr[n - 1] - arr[i];
            if(leftSum>= rightSum)
                count++;
        }
        return count;
    }
}