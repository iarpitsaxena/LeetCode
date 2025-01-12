class Solution {
    public boolean search(int[] nums, int target) {
        return search( nums, target, 0, nums.length -1);
    }

    private boolean search(int[] nums, int target, int l , int r){
        if(l > r) return false;

        final int m = (l + r)/ 2;
        if(nums[m] == target) return true;
        if(nums[l] == nums[m] && nums[m] == nums[r]){
            return search(nums,target,l + 1, r - 1);
        }
        if(nums[l]<=nums[m]){
        if(nums[l] <= target && target < nums[m])
            return search(nums,target,l, m - 1);
        else
            return search(nums, target , m + 1 , r);
        }else{
            if(nums[m] < target && target <= nums[r])
                return search(nums, target , m + 1, r);
            else
                return search(nums,target,l, m - 1);
        }

    }
}

