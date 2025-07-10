class Solution {
    public boolean validPalindrome(String s) {
        int j = s.length() - 1;
        int i = 0;
        while(i <j){
            if(s.charAt(i)!=s.charAt(j)){
            return checkPalindromeHelper(s,i,j-1)||checkPalindromeHelper(s,i+1,j);
            }
            i++;
            j--;
        }
        return true;
    }
    private static boolean checkPalindromeHelper(String s,int i, int j){
        while(i < j){
            if(s.charAt(i)!= s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
            return true;
    }
}