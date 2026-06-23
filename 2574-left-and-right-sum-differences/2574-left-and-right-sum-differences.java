class Solution {
    public int[] leftRightDifference(int[] nums) {
        int totalSum = 0;
        int[] answer = new int[nums.length];
        for(int num : nums){
            totalSum += num;
        }
        int leftSum = 0;
        for(int i = 0;i < nums.length;i++){
            int rightSum = totalSum - leftSum - nums[i];
            answer[i] = Math.abs(rightSum - leftSum);
            leftSum += nums[i];
        }
        return answer;
    }
}