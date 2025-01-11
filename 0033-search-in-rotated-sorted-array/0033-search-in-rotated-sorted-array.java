// class Solution {
//     public int search(int[] nums, int target) {
//         int l = 0;
//         int r  = nums.length -1;

//         while(l<=r){
//             final int m = (l+r)/2;
//             if(nums[m] == target)
//                 return m;

//             if(nums[l] <= nums[m]){
//                 if(nums[l] <= target && target < nums[m])
//                     r = m -1;
//                 else
//                     l = m + 1;
//             }
//             else{
//                 if(nums[m] < target && target <= nums[r]){
//                     l = m + 1;
//                 }
//                 else r = m - 1;
//             }
//         }
//         return -1;
        
//     }
// }


class Solution{
    public int search(int[] nums, int target) {
        return search( nums, target, 0, nums.length -1);
    }

    private int search(int[] nums, int target, int l , int r){
        if(l > r) return -1;

        final int m = (l + r)/ 2;
        if(nums[m] == target) return m;

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