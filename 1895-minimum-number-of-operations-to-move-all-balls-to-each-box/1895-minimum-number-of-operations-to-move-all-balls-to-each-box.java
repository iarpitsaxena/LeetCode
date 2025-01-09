class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int ans[] = new int[n];
        int cumVal = 0;
        int cumValSum = 0; 
        for(int i =0;i<n;i++){
            ans[i] += cumValSum;
            cumVal += boxes.charAt(i) == '0' ? 0 : 1;
            cumValSum += cumVal;
        }

        cumVal =0;cumValSum = 0;
        for(int i=n-1 ;i>=0;i--){
            ans[i] += cumValSum;
            cumVal += boxes.charAt(i) == '0' ? 0 : 1;
            cumValSum += cumVal;
        }
        return ans;


        
    }
}