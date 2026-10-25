class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long answer = 0;
        int bound = -1, minP = -1, maxP = -1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<minK || nums[i]>maxK){
                bound = i;
            }
            if(nums[i] == minK){
                minP = i;
            }
            if(nums[i] == maxK){
                maxP = i;
            }
            answer += Math.max(0, Math.min(minP,maxP) - bound);
        }
        return answer;
        
    }
}