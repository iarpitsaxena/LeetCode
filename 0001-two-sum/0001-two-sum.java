class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> leftValue = new HashMap<>();

        for(int i = 0;i<nums.length;++i){
            if(leftValue.containsKey(target-nums[i])){
                return new int[] {leftValue.get(target - nums[i]),i};
            }
            leftValue.put(nums[i],i);

        }
        throw new IllegalArgumentException();
        
    }
}