class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i]!= nums[correct]){
                swap(nums,i,correct);
            } else{
                i++;
            }
        }
        List<Integer> result = new ArrayList<>();
        for(int j = 0;j< nums.length;j++){
            if(nums[j] == j+1)
                continue;
            else
                result.add(nums[j]);
        }
        return result;
        
    }
    private void swap(int[] nums, int i,int correct){
        int temp = nums[i];
        nums[i] = nums[correct];
        nums[correct] = temp;
    }
}