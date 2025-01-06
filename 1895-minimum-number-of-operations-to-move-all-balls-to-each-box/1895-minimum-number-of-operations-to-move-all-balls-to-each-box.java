class Solution {
    public int[] minOperations(String boxes) {
        int res[] = new int[boxes.length()];
        int count = 0; int ops = 0;
        for(int i = 0; i<boxes.length();i++){
            res[i] = ops;
            count += boxes.charAt(i) - '0';
            ops += count;
        }
        ops=0;count=0;
        for(int i = boxes.length()-1;i > -1; i--){
            res[i] += ops;
            count += boxes.charAt(i) - '0';
            ops += count;
        }
        return res;
    }
}