class Solution {
    static Map<Character, Integer> values = new HashMap<>();

        static {
        values.put('I', 1);
        values.put('V', 5);
        values.put('X', 10);
        values.put('L', 50);
        values.put('C', 100);
        values.put('D', 500);
        values.put('M', 1000);
        }
    public int romanToInt(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int curr = values.get(s.charAt(i));
            int next = (i + 1 < s.length()) ? values.get(s.charAt(i + 1)) : 0;

            if (curr < next) {
                // Subtractive case
                sum -= curr;
            } else {
                sum += curr;
            }
        }
        return sum;
    }
}