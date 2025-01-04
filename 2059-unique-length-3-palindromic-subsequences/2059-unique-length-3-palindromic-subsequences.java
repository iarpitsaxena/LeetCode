class Solution {
    public int countPalindromicSubsequence(String s) {
        int n = s.length();
        // STEP-1: Get first & Last occurrences of each char
        HashMap<Character, int[]> firstLast = new HashMap<>();
        for (int i = 0; i < n; ++i) {
            if (!firstLast.containsKey(s.charAt(i))) {
                firstLast.put(s.charAt(i), new int[]{i, i});
            } else {
                firstLast.get(s.charAt(i))[1] = i;
            }
        }
        // STEP-2: Find unique elements count in range
        int count = 0;
        for (int[] se : firstLast.values()) {
            if (se[0] == se[1]) continue;
            HashSet<Character> uniqueChars = new HashSet<>();
            for (int j = se[0] + 1; j < se[1]; j++) {
                uniqueChars.add(s.charAt(j));
            }
            count += uniqueChars.size();
        }
        return count;
    }
}

