class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int min = matrix[0][0];
        int max = matrix[n-1][n-1];

        while(min < max){
            int mid = min + ((max - min) >> 1);
            int count = countLessEqual(matrix,mid);

            if(count < k) min = mid + 1;
            else max = mid;
        } 
        return min; 
    }
    private int countLessEqual(int[][] matrix, int mid){
        int n = matrix.length;
        int row = n - 1;
        int column = 0;
        int count = 0;

        while(row >= 0 && column < matrix[0].length){
            if(matrix[row][column] <= mid){
                count += (row + 1);
                column++;
            }
            else row --;
        }
        return count;
    }
}