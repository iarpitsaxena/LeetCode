class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length -1;
        while(l<r){
            // if(l==r){
            //     return target;
            // }
            if(numbers[l] + numbers[r]==target)
                return new int[]{l+1,r+1};
            else if(numbers[l] + numbers[r]<target){
                l=l+1;
            }
            else
                r=r-1;
        }

        return new int[]{-1,-1};

    }
}