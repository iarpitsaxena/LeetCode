class Solution {
    public int findDuplicate(int[] nums) {
    sort(nums);
    return nums[nums.length-1];
    }
    static void sort(int [] nums) {
        int i = 0;

        while (i < nums.length) {
            int index = nums[i] -1;
            if(nums[i] != nums[index]){
                swap(nums,i, index);
            }else {
                i++;
            }
        }
    }
    static void swap(int[] nums,int i,int index) {
        int temp = nums[i];
        nums[i] = nums[index];
        nums[index] = temp;
    }
    
}