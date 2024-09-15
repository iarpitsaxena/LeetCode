//using two pointer and sorting method
//this is Dutch national flag algorithm
class Solution {
    public void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);  // Pass the indices
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                swap(nums, mid, high);  // Pass the indices
                high--;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        if(i!=j){
            nums[i]= nums[i]^ nums[j];
            nums[j]= nums[i]^ nums[j];
            nums[i]= nums[i]^ nums[j];
        }
    }
}
