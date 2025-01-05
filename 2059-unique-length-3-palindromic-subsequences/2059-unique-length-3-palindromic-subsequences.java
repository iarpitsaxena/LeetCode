class Solution {
    public int countPalindromicSubsequence(String s) {
        int n = s.length();
        HashMap<Character, int[]> firstLast = new HashMap<>();
        for(int i = 0; i< n;i++){
            if(!firstLast.containsKey(s.charAt(i))){
                firstLast.put(s.charAt(i),new int[]{i,i});
            } else{
                firstLast.get(s.charAt(i))[1]= i;
            }
        }

        int count = 0;
        for(int[] se : firstLast.values()){

            if(se[0]==se[1]) continue;
            HashSet<Character> uniqueChar = new HashSet<>();
            for(int j = se[0]+1;j<se[1];j++){
                uniqueChar.add(s.charAt(j));
            }
            count += uniqueChar.size();
        }
    return count;
    }
}

