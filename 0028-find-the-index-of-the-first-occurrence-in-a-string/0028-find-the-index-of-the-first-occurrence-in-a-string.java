class Solution {
    public int strStr(String haystack, String needle) {
        int m = haystack.length();
        int n = needle.length();
        for(int w = 0;w <=m-n;w++){
            for(int i = 0;i < n;i++){
                if(needle.charAt(i)!=haystack.charAt(w+i)){
                    break;
                }
                if(i == n-1){
                    return w;
                }
            }
        }
        return -1;
    }
}