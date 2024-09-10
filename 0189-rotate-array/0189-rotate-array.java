// class Solution {
    // public void rotate(int[] nums, int k) {
    //     brute force approach
    //     int n=nums.length;
    //        k=k%n;

    //     for(int i = 0;i<k;++i){
    //         int last = nums[n-1];
    //         for(int j = n-1;j>0;--j){
    //             nums[j]=nums[j-1];
    //         }
        
    //     nums[0]= last;
    //     }

    //     int n = nums.length;
        
//     }
// }

class Solution {
  public void rotate(int[] nums, int k) {
    k %= nums.length;
    reverse(nums, 0, nums.length - 1);
    reverse(nums, 0, k - 1);
    reverse(nums, k, nums.length - 1);
  }

  private void reverse(int[] nums, int l, int r) {
    while (l < r)
      swap(nums, l++, r--);
  }

  private void swap(int[] nums, int l, int r) {
    final int temp = nums[l];
    nums[l] = nums[r];
    nums[r] = temp;

  }
}
