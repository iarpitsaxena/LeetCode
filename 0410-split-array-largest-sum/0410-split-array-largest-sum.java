class Solution {
    public int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;
        for(int i = 0; i < nums.length; i++){
            start = Math.max(start, nums[i]);// in the end of loop this will contain the max item from the array.
            end += nums[i];
        }
        // apply binary search
        while(start < end){
            //try for the middle for potential answer
            int mid = start + (end - start)/2;
            // calculate how many pieces you can divide this in with this max sum
            int sum = 0;
            int pieces = 1;//Initially, you can divide it into 1 piece
            for(int num : nums){
                if(sum + num > mid){
                    sum = num;
                    pieces++;
                }else {
                    sum += num;
                }
            }
            if(pieces > k)
                start = mid + 1;
            else
                end = mid;

        }
        return end;// here start == end
    }
}