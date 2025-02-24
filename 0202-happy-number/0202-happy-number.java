class Solution {
    public boolean isHappy(int n) {
        int slow = square(n);
        int fast = square(square(n));

        while(slow != fast){
            slow = square(slow);
            fast = square(square(fast));
        }
        return slow == 1;
    }
        private int square(int number){
            int sum = 0;
            while(number > 0){
                int digit = number % 10;
                sum += digit * digit;
                number /= 10;
            }
            return sum;
        }
}