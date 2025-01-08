class Solution {
    public int maximumWealth(int[][] accounts) {
        int wealth = 0;
        int row = accounts.length;
        int col = accounts[0].length;
        for(int i =0;i<row;i++){
            int perWealth = 0;
            for(int j =0;j<col;j++){
                perWealth+=accounts[i][j];
            }
            wealth=Integer.max(wealth,perWealth);
    }return wealth;
        }
}