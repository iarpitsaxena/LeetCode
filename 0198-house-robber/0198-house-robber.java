// class Solution {
//     int[] t = new int[101];
//     int solve(int[] nums, int i, int n){

//         if(i >=n) return 0;
//         if(t[i] != -1) return t[i];


//         int steal = nums[i] + solve(nums,i+2,n);
//         int skip = solve(nums,i+1,n);
//         return t[i] = Math.max(steal,skip);
//     }
//     public int rob(int[] nums) {
//         int n = nums.length;
//         Arrays.fill(t,-1);
//         return solve(nums,0,n);
//     }
// }

// // this is done using memoization + recursion(top-down approach).



class Solution{
    public int rob(int[] nums){
        int n = nums.length;
        if(n == 1) return nums[0];
        int[] t = new int[n+1];

        t[0] = 0;
        t[1] = nums[0];
        for(int i = 2;i <=n;i++){
            int steal = nums[i-1] + t[i-2];
            int skip = t[i-1];
            t[i] = Math.max(steal,skip);
        }
        return t[n];

    }
}