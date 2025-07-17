class Solution {
    public int lengthOfLastWord(String s) {
        int n = s.length() - 1;
        while(n>=0 && s.charAt(n)==' '){
            n--;
        }
        int length = 0;
        while(n>=0 && s.charAt(n)!=' '){
            length++;
            n--;
        }
        return length;
    }
}