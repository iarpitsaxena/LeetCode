class Solution {
    int[] prefix;
    Random random;
    int total;
    public Solution(int[] w) {
        prefix = new int[w.length];
        prefix[0] = w[0];
        random = new Random();
        for(int i = 1;i < w.length;i++){
            prefix[i] = prefix[i-1] + w[i];
        }
        total = prefix[prefix.length - 1];
    }
    
    public int pickIndex() {
        int target = random.nextInt(total) + 1;
        int left = 0;
        int right = prefix.length -1;
        while(left < right){
            int mid = left + (right - left)/2;
            if(prefix[mid] < target){
                left = mid + 1;
            }
            else{
                right = mid;
            }
        }
        return left;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */