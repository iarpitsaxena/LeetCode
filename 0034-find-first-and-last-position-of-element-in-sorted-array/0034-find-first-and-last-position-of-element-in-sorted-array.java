class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l = firstGreaterEqual(nums, target);
        if( l == nums.length || nums[l] != target)
            return new int[] {-1,-1};
        int r = firstGreaterEqual(nums, target + 1) - 1;
        return new int[] {l,r};
    }

    private int firstGreaterEqual(int[] arr, int target){
        int l = 0;
        int r = arr.length;
        while(l<r){
            final int mid = (l + r) / 2;
            if(arr[mid] >= target)
                r = mid;
            else 
                l = mid + 1;
        }
        return l;
    }
}