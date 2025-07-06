class Solution {
    public boolean checkPowersOfThree(int n) {
        return checkHelper(0, n); 
    }

    private boolean checkHelper(int power,int n){
        if(n == 0) return true;
        if(Math.pow(3,power) > n) return false;

        boolean addPower = checkHelper(power  + 1, n - (int)Math.pow(3,power));
        boolean skipPower = checkHelper(power  + 1, n);

        return addPower || skipPower;
    }
}