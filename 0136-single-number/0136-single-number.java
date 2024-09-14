class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for(final int i: nums){
            ans^= i;
        }
        return ans;
        
    }
}