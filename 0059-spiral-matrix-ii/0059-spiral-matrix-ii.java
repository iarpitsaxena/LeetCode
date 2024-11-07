class Solution {
    public int[][] generateMatrix(int n) {
        int top = 0, left = 0,right = n-1,bottom = n-1;
        int arr[][] = new int[n][n];
        int counter =1;
        while(counter<=(n*n)){
            for(int i = left;i<=right && counter <= (n*n);i++){
                arr[top][i]=counter++;
            }
            // top++;
            for(int i= top+1;i<=bottom && counter <= (n*n);i++){
                arr[i][right]=counter++;
            }
            // bottom--;
            // if(top<=bottom){
            for(int i=right-1;i>=left&& counter <= (n*n);i--){
                arr[bottom][i]=counter++;
            }
            for(int i = bottom-1;i>=top +1 && counter <= (n*n);i--){
                arr[i][left]=counter++;
            }
            
            
            top++;
            bottom--;
            left++;
            right--;
        }
        return arr;
        
    }
}