class Solution {
    public int minOperations(int[][] grid, int x) {
        ArrayList<Integer> numsArray = new ArrayList<>();
        int result = 0;

        for(int i = 0;i < grid.length;i++){
            for(int j = 0;j < grid[0].length;j++){
                numsArray.add(grid[i][j]);
            }
        }
        Collections.sort(numsArray);
        int length = numsArray.size();
        int commonNumber = numsArray.get(length/2);

        for(int i : numsArray){
            if(i % x != commonNumber % x) return -1;
            result += Math.abs(commonNumber - i) / x;
        }
        return result;
        
    }
}