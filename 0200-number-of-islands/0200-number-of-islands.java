class Pair {
    int first;
    int second;

    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] vis = new int[n][m];
        int count = 0;

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                if (grid[row][col] == '1' && vis[row][col] == 0) {
                    count++;
                    bfs(row, col, vis, grid);
                }
            }
        }
        return count;
    }

    private void bfs(int row, int col, int[][] vis, char[][] grid) {
    vis[row][col] = 1;
    Queue<Pair> q = new LinkedList<>();
    q.add(new Pair(row, col));
    int n = grid.length;
    int m = grid[0].length;

    // Only 4 directions (no diagonals)
    int[] dRow = {-1, 0, 1, 0};
    int[] dCol = {0, 1, 0, -1};

    while (!q.isEmpty()) {
        int ro = q.peek().first;
        int co = q.peek().second;
        q.remove();

        for (int i = 0; i < 4; i++) {
            int nrow = ro + dRow[i];
            int ncol = co + dCol[i];

            if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m &&
                grid[nrow][ncol] == '1' && vis[nrow][ncol] == 0) {
                vis[nrow][ncol] = 1;
                q.add(new Pair(nrow, ncol));
                }
        }
    }
    }
}