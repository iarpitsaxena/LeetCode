class Solution {
    public int minInsertions(String s) {
        int neededRight = 0;
        int missRight = 0;
        int missLeft  = 0;

        for(char ch : s.toCharArray()){
            if(ch == '('){
                if(neededRight % 2 == 1){
                    ++missRight;
                    --neededRight;
                }
                neededRight+=2;
            }
            else if(--neededRight<0){
                ++missLeft;
                neededRight += 2;
            }
        }
        return missRight + missLeft + neededRight;
    }
}