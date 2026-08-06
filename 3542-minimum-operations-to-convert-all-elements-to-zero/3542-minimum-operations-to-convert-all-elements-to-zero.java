class Solution {
    public int minOperations(int[] nums) {
        Deque<Integer> stack = new ArrayDeque<>();
        int res = 0;
        for(int num : nums){
            while(!stack.isEmpty() && stack.peek() > num) stack.pop();
            if(num == 0) continue;
            if(stack.isEmpty() || stack.peek() < num){
                stack.push(num);
                res ++;
            }
        }
        return res;
    }
}