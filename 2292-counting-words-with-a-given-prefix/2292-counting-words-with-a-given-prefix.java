class Solution {
    public int prefixCount(String[] words, String pref) {
        int count = 0 ;
        for(String word : words){
            count+= PrefixCount(word,pref);
        }
        return count;
    }

    private int PrefixCount(String word,String pref){
        int i=0;
        for(i = 0;i<word.length()&& i<pref.length();i++){
            if(word.charAt(i)!=pref.charAt(i)){
                return 0;
            }
        }
        if(i!= pref.length()){
            return 0;
        }
        return 1;
    }
}