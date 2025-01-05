

class Solution{
    public int maxFrequencyElements(int[] nums){
        final int fMax = 100;
        int ans = 0;
        int[] count = new int[fMax + 1];

        for(int num : nums){
            count[num]++;
        }
        final int maxFreq = Arrays.stream(count).max().getAsInt();
        for(int freq: count){
            if(freq == maxFreq)
                ans+=maxFreq;
        }
        return ans;
    }
}